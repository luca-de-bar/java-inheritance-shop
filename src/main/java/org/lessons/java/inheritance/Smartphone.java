package org.lessons.java.inheritance;

public class Smartphone extends Product{

	private String IMEI;
	private int memorySizeGB;
	
	//Smartphone Constructor
	protected Smartphone (int memorySizeGB) {
		this.IMEI=RandomIMEI.generateIMEI();
		this.memorySizeGB=memorySizeGB;
	}
	
	//Smartphone empty Constructor
	protected Smartphone() {
		this.IMEI=RandomIMEI.generateIMEI();
	}
	
	//Getter Methods
	public String getIMEI() {
		return this.IMEI;
	}
	
	public int getMemorySize() {
		return this.memorySizeGB;
	}
	
	//Setter Methods
	public void setMemorySize(int newSize) {
		this.memorySizeGB=newSize;
	}
	
	
	
	//Get all info
	@Override
	public void getInfo() {
		System.out.println("----- SMARTPHONE INFO -----");
		System.out.println("Product Code : " + super.getProductCode());
		System.out.println("IMEI : " + this.IMEI);
		System.out.println("Name : " + super.getProductName());
		System.out.println("Brand : " + super.getBrandName());
		System.out.println("Memory GB : " + this.memorySizeGB + "GB");
		System.out.println("Price : " + super.getPrice() + "€" + "\n");
	}
}
