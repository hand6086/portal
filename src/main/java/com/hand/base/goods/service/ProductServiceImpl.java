package com.hand.base.goods.service;

import com.hand.base.goods.dao.mybatis.mapper.ProductMapper;
import com.hand.base.goods.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> queryList(Product record) throws Exception {
		return productMapper.queryList(record);
	}

	@Override
	public Integer queryListCount(Product record) throws Exception {
		return productMapper.queryListCount(record);
	}


}
