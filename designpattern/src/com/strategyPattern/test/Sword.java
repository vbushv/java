package com.strategyPattern.test;

public class Sword implements Weapon{

	@Override
	public void doAttack() {

		System.out.println("검 공격");
		
	}

	public void health() {
		System.out.println("체력");
	}
	
}
