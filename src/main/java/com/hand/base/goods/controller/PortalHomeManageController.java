package com.hand.base.goods.controller;

import com.hand.base.goods.model.HomeManage;
import com.hand.base.goods.service.HomeManageService;
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
@RequestMapping("/action/portal/homeManage")
public class PortalHomeManageController {
	private static final Logger logger = LogManager.getLogger(PortalHomeManageController.class);
	@Autowired
	private HomeManageService homeManageService;
	

	@RequestMapping(value = "/smsHomeLogo", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> smsHomeLogo(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		try{
			/*
			List<HomeManage> list = new ArrayList<>();

			HomeManage left = new HomeManage();
			left.setId("123");
			left.setPic("http://47.105.146.145/share/pic/left.jpg");
			left.setType("left");

			HomeManage right = new HomeManage();
			right.setId("456");
			right.setPic("http://47.105.146.145/share/pic/right.jpg");
			right.setType("right");
			*/

			HomeManage top = new HomeManage();
			top.setId("123");
			top.setPic("http://47.105.146.145/share/pic/top.jpg");
			top.setType("top");

			/*list.add(left);
			list.add(right);
			list.add(top);*/

			result.put("success", 1);
			result.put("code", "");
			result.put("msg", "");
			result.put("data", top);
		}catch(Exception e){
			e.printStackTrace();
			result.put("success", false);
			result.put("result", e.getMessage());
		}
		return result;
	}


    @RequestMapping(value = "/adverse", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> adverse(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<String, Object>();
        try{

			List<HomeManage> list = new ArrayList<>();

			HomeManage left = new HomeManage();
			left.setId("123");
			left.setPic("http://47.105.146.145/share/pic/left.jpg");
			left.setType("left");

			HomeManage right = new HomeManage();
			right.setId("456");
			right.setPic("http://47.105.146.145/share/pic/right.jpg");
			right.setType("right");

			list.add(left);
			list.add(right);

            result.put("success", 1);
            result.put("code", "");
            result.put("msg", "");
            result.put("data", list);
        }catch(Exception e){
            e.printStackTrace();
            result.put("success", false);
            result.put("result", e.getMessage());
        }
        return result;
    }

}
