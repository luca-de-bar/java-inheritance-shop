package org.lessons.java.inheritance;

import java.util.Random;

public class Product {
	
	private int productCode;
	private String name;
	private String brand;
	private double price;
	private int VAT;
	
	private static final Random randProductCode = new Random();
	
	//Product empty constructor
	protected Product ( ) {
		this.productCode = randProductCode.nextInt(1000);
	}
	
	//Product Constructor
	protected Product (String name, String brand, double price ) {
		this.productCode = randProductCode.nextInt(1000);
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.VAT=22;
	}
	
	//Getter Methods
	public int getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return this.name;
	}
	
	public String getBrandName() {
		return this.brand;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	//Setter Methods
	public void setProductName(String newName) {
		this.name=newName;
	}
	
	public void setBrandName(String newBrand) {
		this.brand=newBrand;
	}
	
	public void setPrice(double newPrice) {
		this.price=newPrice;
	}
	
	
}
