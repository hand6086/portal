package com.hand.base.goods.service;

import com.hand.base.goods.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> queryList(Product record) throws Exception;

    Integer queryListCount(Product record) throws Exception;
	
	
}
