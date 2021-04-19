package com.myspring.dao.impl;

import com.myspring.dao.ProductDao;
import com.myspring.po.Product;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
	/*交给Spring注入*/
	private QueryRunner queryRunner;

	@Override
	public void updateProduct(Product product) {
		try {
			queryRunner.update("UPDATE spring.product SET pname=?,price=?,category=? WHERE pid=?",
					             product.getPname(),product.getPrice()
					             ,product.getCategory(),product.getPid());
		} catch (SQLException throwables) {
			throw new RuntimeException(throwables.getMessage());
		}
	}

	@Override
	public List<Product> findAll() {
		try {
			return queryRunner.query("SELECT * FROM spring.product",
					                    new BeanListHandler<Product>(Product.class));
		} catch (SQLException throwables) {
			throw new RuntimeException(throwables.getMessage());
		}
	}
	public void setQueryRunner(QueryRunner queryRunner) {
		this.queryRunner = queryRunner;
	}
}
