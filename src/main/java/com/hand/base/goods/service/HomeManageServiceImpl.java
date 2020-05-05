package com.hand.base.goods.service;

import com.hand.base.goods.dao.mybatis.mapper.HomeManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeManageServiceImpl implements HomeManageService {

	@Autowired
	private HomeManageMapper homeManageMapper;
	
}
