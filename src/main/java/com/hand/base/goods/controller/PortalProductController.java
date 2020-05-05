package com.hand.base.goods.controller;

import com.hand.base.goods.model.Product;
import com.hand.base.goods.model.ProductPack;
import com.hand.base.goods.service.ProductService;
import com.hand.core.util.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/action/portal/product")
public class PortalProductController {
	private static final Logger logger = LogManager.getLogger(PortalProductController.class);
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> list(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			Product record = new Product();

			String pageParam = request.getParameter("page");
			String rows = request.getParameter("rows");
			String provinceId = request.getParameter("provinceId");
			String cityId = request.getParameter("cityId");
			String districtId = request.getParameter("districtId");
			record.setProvinceId(provinceId);
			record.setCityId(cityId);
			record.setDistrictId(districtId);
			record.setRows(rows == null ? 10 : Integer.valueOf(rows));
			record.setPage(null == pageParam ? 1 : Integer.valueOf(pageParam));

			Integer total = productService.queryListCount(record);
			record.setTotal(total);

			String requestUrl = "/action/portal/product/list?";
			String requestAttr = "rows=" + record.getRows();
			if(!StringUtils.isNull(record.getCityId())) {
				requestAttr = requestAttr + "&cityId=" + record.getCityId();
			}
			if(!StringUtils.isNull(record.getDistrictId())) {
				requestAttr = requestAttr + "&districtId=" + record.getDistrictId();
			}

			String firstPageUrl = requestUrl + "page=1&" + requestAttr;
			String previousPageUrl;
			Integer page = record.getPage();
			if(1 == page) {
				previousPageUrl = requestUrl + "page=1&" + requestAttr;
			}else {
				previousPageUrl = requestUrl + "page=" + (page - 1) + "&" + requestAttr;
			}
			String nextPageUrl;
			Integer totalPage = record.getTotalPage();
			if(page == totalPage) {
				nextPageUrl = requestUrl + "page=" + totalPage + "&" + requestAttr;
			} else {
				nextPageUrl = requestUrl + "page=" + (page + 1) + "&" + requestAttr;
			}
			String lastPageUrl = requestUrl + "page=" + totalPage + "&" + requestAttr;

			ProductPack productPack = new ProductPack();
			productPack.setFirstPageUrl(firstPageUrl);
			productPack.setPreviousPageUrl(previousPageUrl);
			productPack.setNextPageUrl(nextPageUrl);
			productPack.setLastPageUrl(lastPageUrl);

			List<Product> list = productService.queryList(record);
			productPack.setRecords(list);
			result.put("success", 1);
			result.put("msg", "");
			result.put("data", productPack);
		}catch(Exception e){
			e.printStackTrace();
			result.put("success", 0);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	
}
