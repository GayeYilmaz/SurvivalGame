package SurvivalGame;

import java.util.Scanner;

public class Player {
	
	private Inventory inventory;
	
	private int damage;
	private int health;
    private int money; 
    private String name;
    private String charName;
    private int originalHealth;

    
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
				+ "Damage : "+this.getTotalDamage()+" , "
				+ "Health : "+this.getHealth()+" ,  "
				+ "Money : "+this.getMoney()+" , "
				+ "Weapon : "+this.getInventory().getWeapon().getName()+" , "
				+ "Armor : "+this.getInventory().getArmor().getName()+" , "
				+ "Block : "+ this.getInventory().getArmor().getBlock()); 
    	
    	
		
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

	public int getTotalDamage() {
		return damage +this.getInventory().getWeapon().getDamage();
	}
	public int getDamage() {
		return damage ;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health<0) {
			health = 0;
		}
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
    	System.out.println("------------------------------------------------------------------------------------------");
    	System.out.print("Please choose a character : ");
    	
    	
    	
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
        this.setOriginalHealth(gameChar.getHealth());
    	
    }

	public int getOriginalHealth() {
		return originalHealth;
	}

	public void setOriginalHealth(int originalHealth) {
		this.originalHealth = originalHealth;
	}
  

}
