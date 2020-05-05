package com.hand.base.goods.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/action/portal/omsCart")
public class PortalOmsCartController {
	private static final Logger logger = LogManager.getLogger(PortalOmsCartController.class);

	@RequestMapping(value = "/queryNumber", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryNumber(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			result.put("success", 1);
			result.put("msg", "");
			result.put("data", 2);
		}catch(Exception e){
			e.printStackTrace();
			result.put("success", 0);
			result.put("msg", e.getMessage());
		}
		return result;
	}
	

}
