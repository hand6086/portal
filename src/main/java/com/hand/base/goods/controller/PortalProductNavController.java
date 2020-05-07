package com.hand.base.goods.controller;

import com.hand.base.goods.model.ProductNav;
import com.hand.base.goods.model.TopProductNav;
import com.hand.base.goods.service.ProductNavService;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/action/portal/productNav")
public class PortalProductNavController {
	private static final Logger logger = LogManager.getLogger(PortalProductNavController.class);
	@Autowired
	private ProductNavService productNavService;
	

	@RequestMapping(value = "/queryAll", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryAll(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			List<TopProductNav> list = new ArrayList<>();
			TopProductNav provinceNav = new TopProductNav();
			provinceNav.setId("1-7DSX1D");
			provinceNav.setName("山东省");

			List<ProductNav> productNavList = productNavService.queryAll();
			provinceNav.setChildren(productNavList);
			list.add(provinceNav);
			result.put("success", 1);
			result.put("msg", "");
			result.put("data", list);
		}catch(Exception e){
			e.printStackTrace();
			result.put("success", 0);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	

}
