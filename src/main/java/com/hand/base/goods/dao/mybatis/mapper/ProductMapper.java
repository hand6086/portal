package com.hand.base.goods.dao.mybatis.mapper;

import com.hand.base.goods.model.Product;

import java.util.List;

public interface ProductMapper {

    List<Product> queryList(Product record) throws Exception;

    Integer queryListCount(Product record) throws Exception;

}