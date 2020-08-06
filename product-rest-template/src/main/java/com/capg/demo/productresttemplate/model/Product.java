package com.capg.demo.productresttemplate.model;

public class Product {
private int prodId;
private String prodName;
private double prodPrice;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int prodId, String prodName, double prodPrice) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.prodPrice = prodPrice;
}
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
}
