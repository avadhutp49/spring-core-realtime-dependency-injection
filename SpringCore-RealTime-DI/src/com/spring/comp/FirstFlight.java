package com.spring.comp;

public class FirstFlight implements Courier {

	
	static {
		System.out.println("FirstFlight :: Loading");
	}

	public FirstFlight() {
		// TODO Auto-generated constructor stub
		System.out.println("FirstFlight :: Zero param constructor");
	}
	
	
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight Courier Courier will deliver your Order id :: "+oid;
	}

}
