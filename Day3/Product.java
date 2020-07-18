package com.htc.day3;

public class Product extends Object {
	private int productId;
	private String productName;
	private int productPrice;
	
	// default construtor 
	public Product(){
		System.out.println("Default constructor is fired  ");
		productId=0;
		productName=" ";
		productPrice=0;
		
	}
	// overloaded construtor 
	public Product(int productId, String productName, int productPrice) {
		super();
		System.out.println("overloaded Constructor is fired ");
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	//setter for productId
	public void setProductId(int productId){
        this.productId=productId;		
	}
	
	//setter for productname
	public void setProductname(String productName) {
		this.productName=productName;
	}
	
	// setter for product price 
	public void setproductPrice(int productPrice) {
		this.productPrice=productPrice;
	}
	
	//getter for productID
	public int getProductId() {
		return productId;
	}
	
	//getter for ProductName
	public String getProductname() {
		return productName;
	}
	
	// getter for ProductPrice 
	public int getproductPrice() {
		return productPrice;
	}
	

}
