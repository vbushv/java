package com.adapter.test;

public class AdaptorMain {

	public static void main(String[] args) {
		
		Adaptor adaptor = new AdaptorImpl();
		System.out.println(adaptor.plus(100, 10));
		System.out.println(adaptor.minus(50, 20));
	}
	
}
