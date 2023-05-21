package com.spring.comp;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC :: Loading");
	}

	public DTDC() {
		System.out.println("DTDC :: Zero param constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will deliver your Order id :: "+oid;
	}

}
