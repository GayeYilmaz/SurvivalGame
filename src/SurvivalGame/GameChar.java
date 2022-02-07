package SurvivalGame;

public abstract class GameChar {
	private String charName;
	private int damage;
	private int health;
	private int money;
	private int id;
	public GameChar(int id,String charName,int damage, int health, int money) {
		super();
		this.charName = charName;
		this.damage = damage;
		this.health = health;
		this.money = money;
		this.id = id;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
