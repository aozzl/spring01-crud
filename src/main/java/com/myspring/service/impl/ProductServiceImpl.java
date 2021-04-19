package com.myspring.service.impl;

import com.myspring.dao.ProductDao;
import com.myspring.po.Product;
import com.myspring.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
	/*交给Spring注入*/
    private ProductDao productDao;

    @Override
	public void updateProduct(Product product) {
        productDao.updateProduct(product);
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
}
