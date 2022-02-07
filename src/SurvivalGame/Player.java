package SurvivalGame;

import java.util.Scanner;

public class Player {
	
	private Inventory inventory;
	
	private int damage;
	private int health;
    private int money; 
    private String name;
    private String charName;

    
	public Player() {
		super();
	}

	public Player(String name) {
		super();
		
		this.name = name;
		this.inventory = new Inventory(); 
		
	}
	public void printInfo() {
		System.out.println("Character name : "+this.getCharName()+" , "
				+ "Damage : "+this.getDamage()+" , "
				+ "Health : "+this.getHealth()+" ,  "
				+ "Money : "+this.getMoney()+" , "
				+ "Weapon : "+this.getInventory().getWeapon().getName()); 
    	
    	
		
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public int getDamage() {
		return damage +this.getInventory().getWeapon().getDamage();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public void selectChar() {
    	
    	GameChar chars[] = {new Samurai(), new Archer(), new Paladin()};
    	for(GameChar gameChar : chars) {
    		System.out.println("ID : "+gameChar.getId()+"\t Character name : "+gameChar.getCharName()+"\t Damage : "+gameChar.getDamage()+" \t Health : "+gameChar.getHealth()+"\t Money : "+gameChar.getMoney());
    	}
    	System.out.println("Please choose a character.");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	int charNum = scan.nextInt();
    	
    	switch(charNum) {
    	case 1:
    	    this.initChar(new Samurai());
    		break;
    	case 2:
    		this.initChar(new Archer());
    		break;
    	case 3:
    		this.initChar(new Paladin());
    		break;
    	default:
    		System.out.println("Wrong entry!");
    		break;
    	
    	}
    	
    	
    	
    }
    
    public  void initChar(GameChar gameChar) {
    	this.setDamage(gameChar.getDamage());
    	this.setHealth(gameChar.getHealth());
    	this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getCharName());    	
    	
    }
  

}
