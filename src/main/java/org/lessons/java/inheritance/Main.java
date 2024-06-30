package org.lessons.java.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone Iphone14 = new Smartphone();
		TV samsungTV = new TV();
		Headset bose = new Headset();
		
		
		bose.setProductName("Bose High Quality Sound");
		bose.setBrandName("Bose");
		bose.setColor("Red");
		bose.setWireless(true);
		bose.setPrice(250d);
		
		samsungTV.setProductName("Samsung TV 4k 144FPS Gaming Pro");
		samsungTV.setBrandName("Samsung Inc.");
		samsungTV.setScreenSize(65);
		samsungTV.setSmart(true);
		samsungTV.setPrice(5600d);
			
		Iphone14.setProductName("Iphone 14 Pro Max");
		Iphone14.setBrandName("Apple Inc.");
		Iphone14.setPrice(1200d);
		Iphone14.setMemorySize(520);
		
		Iphone14.getInfo();
		samsungTV.getInfo();
		bose.getInfo();
	}	

}
