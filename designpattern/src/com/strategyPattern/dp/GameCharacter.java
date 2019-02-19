package com.strategyPattern.dp;

public class GameCharacter {

	// 체력,마력,스테미너 등..

	private Weapon weapon;

	public int attact() {

		return weapon.doAttact();
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
