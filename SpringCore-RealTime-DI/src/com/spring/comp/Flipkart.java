package com.spring.comp;

import java.util.Arrays;
import java.util.Random;

//Target Object
public class Flipkart {
	
	//Dependent Object
	private Courier courier;
	private Float discount;
	
	static {
		System.out.println("\nFlipkart.class file is loading...");
	}

	public Flipkart() {
		System.out.println("Flipkart:: Zero param constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}

	//Business Logic
	public String doShopping(String[] items, float prices[]) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);
		
		int oid = 0;
		float billAmt = 0;
		Random random = null;
		
		for (float price : prices) {
			billAmt += price;
		}
		float disBill = billAmt-((billAmt)*discount/100.0f);
		random = new Random();
		oid = random.nextInt(10000);
		System.out.println("Order Id :: "+ oid);
		String msg = courier.deliver(oid);
		
		return " \n\t Purchased Items are :: "+Arrays.toString(items) + "\n\t Prices :: " + Arrays.toString(prices)
		+ "\n\t Bill Amount :: " + billAmt + "\n\t Discounted Bill Amount ::" + disBill + "\n\t ==>  " + msg;
	}
	
	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}
}