package com.myspring.po;

public class Product {
	/**
	 * 商品标号
	 */
	private Integer pid;

	/**
	 * 商品名称
	 */
	private String pname;

	/**
	 * 商品价格
	 */
	private Double price;

	/**
	 *商品种类
	 */
	private String category;

	public Product() {
	}

	public Product(Integer pid, String pname, Double price, String category) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.category = category;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product{" +
				"pid=" + pid +
				", pname='" + pname + '\'' +
				", price=" + price +
				", category='" + category + '\'' +
				'}';
	}
}

