package com.strategyPattern.test;

public class Game {

	private Weapon weapon;
	private Defance defance;

	public void attack() {
		weapon.doAttack();
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void defance() {
		defance.doDefance();
	}
	
	public void setDefance(Defance defance) {
		this.defance = defance;
	}
	
	
	
}
