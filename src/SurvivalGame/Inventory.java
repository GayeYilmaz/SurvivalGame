package SurvivalGame;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private Weapon weapon;
	private Armor armor;
	List<String> prize ;
	public Inventory() {
		this.weapon = new Weapon("Punch",-1,0,0);
		this.armor = new Armor(-1,"Rag",0,0);
		prize = new ArrayList<>();
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public List<String> getPrize() {
		return prize;
	}

	public void setPrize(List<String> prize) {
		this.prize = prize;
	}

	
	

}
