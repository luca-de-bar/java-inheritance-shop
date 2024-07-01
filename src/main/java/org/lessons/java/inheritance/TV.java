package org.lessons.java.inheritance;

public class TV extends Product {

	private int inchScreenSize;
	private boolean isSmart;
	
	//TV Constructor
	public TV(int inchScreenSize, boolean isSmart) {
		this.inchScreenSize=inchScreenSize;
		this.isSmart=isSmart;
	}
	
	//TV Empty Constructor
	public TV () {
		
	}
	
	//Getter Methods
	public int getScreenSize() {
		return this.inchScreenSize;
	}
	
	public boolean isSmart() {
		return this.isSmart;
	}
	
	//Setter Methods
	public void setScreenSize(int newScreenSize) {
		this.inchScreenSize=newScreenSize;
	}
	
	public void setSmart(boolean newSmart) {
		this.isSmart=newSmart;
	}
	
	//Getter Methods
	@Override
	public void getInfo () {
		System.out.println("----- TV INFO -----");
		System.out.println("Product Code : " + super.getProductCode());
		System.out.println("Product Name : " + super.getProductName());
		System.out.println("Brand :" + super.getBrandName());
		System.out.println("Screensize : " + this.inchScreenSize + " Inch");
		System.out.println("Smart : " + this.isSmart );
		System.out.println("Price : " + super.getPrice() + "€" + "\n");
	}
}
