package com.adapter.test;

public class AdaptorImpl implements Adaptor{

	
	@Override
	public int plus(int a, int b) {
		return Math.plus(a, b);
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return Math.minus(a, b);
	}

}
