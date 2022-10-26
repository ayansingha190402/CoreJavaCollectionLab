//defining packages 
package com.StoreProduct;

//defining the class Product 
public class Product {
	
	
	//declaring private instance variables 
	private int ID;
	private String productName;
	private String brand;
	private int quantity;
	private int price;
	
	//declaring Constructors 
	//without parameter 
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//declaring Constructors 
	//using parameters
	public Product(int iD, String productName, String brand, int quantity, int price) {
		super();
		ID = iD;
		this.productName = productName;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}

	
	//getter and setter method methods 
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	//to string methods 
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", productName=" + productName + ", brand=" + brand + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}//end 
	
	
	
	
}//end of class Product
