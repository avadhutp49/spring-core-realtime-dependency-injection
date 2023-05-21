package com.spring.comp;

public class BlueDart implements Courier {
	
	static {
		System.out.println("BlueDart :: Loading");
	}

	public BlueDart() {
		System.out.println("BlueDart :: Zero param constructor");
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "BlurDart Courier will deliver your Order id :: "+oid;
	}
}
