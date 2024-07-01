package org.lessons.java.inheritance;

public class Headset extends Product {
	
	private String color;
	private boolean isWireless;
	
	//Headset empty Constructor
	public Headset() {
		
	}
	
	//Headset constructor
	public Headset(String color, boolean isWireless) {
		this.color=color;
		this.isWireless=isWireless;
	}
	
	//Getter Methods
	public String getColor () {
		return this.color;
	}
	
	public boolean getWireless() {
		return this.isWireless;
	}
	
	//Setter Methods
	public void setColor(String newColor) {
		this.color=newColor;
	}
	
	public void setWireless(boolean newWireless) {
		this.isWireless=newWireless;
	}
	
	
	//Get product Info
	@Override
	public void getInfo() {
		System.out.println("---- HEADSET INFO ----");
		System.out.println("Product Code : " + super.getProductCode());
		System.out.println("Name : " + super.getProductName());
		System.out.println("Brand : " + super.getBrandName());
		System.out.println("Color : " + this.color);
		System.out.println("Wireless : " + this.isWireless);
		System.out.println("Price : " + super.getPrice() + "€" + "\n");
	}
}
