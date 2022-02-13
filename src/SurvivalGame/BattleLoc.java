package SurvivalGame;

import java.util.Random;

public abstract class BattleLoc extends Location{
	
	private Obstacle obstacle;
	private String award;
	private int maxObstacle;
	
	public BattleLoc(Player player, String name, Obstacle obstacle,String award,int maxObstacle) {
		super(player, name	);
		this.obstacle = obstacle;
		this.award = award;
		this.maxObstacle = maxObstacle;
	}

	@Override
	public boolean onLocation() {
		int obsNumber = randomObstacleNumber();
		
		System.out.println("You are here now : "+this.getName());
		System.out.println("Watch out! There is "+obsNumber +" "+this.getObstacle().getName()+" living in here!");
		System.out.print("<F>ight or <R>ecede : ");
		
		String selectCase = scan.nextLine();
		selectCase = selectCase.toUpperCase();
		if(selectCase.equals("F") && combat(obsNumber)) {
			
				System.out.println("You defeat the all "+this.getObstacle().getName()+" in the "+this.getName());
				return true;
			
		}
		
		if(this.getPlayer().getHealth() <= 0 ) {
			System.out.println("You dead!");
			return false;
		}
		return true;
	}

	public int randomObstacleNumber() {
		Random r = new Random();
		return r.nextInt(this.getMaxObstacle()) + 1;
	}
	public boolean  combat(int obsNumber) {
		for(int i = 1; i <= obsNumber; i++) {
			this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
			playerStats();
			obstacleStats( i);
			while(this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
				System.out.print("<H>it or <R>un : ");
				String selectCombat = scan.nextLine().toUpperCase();
				
				if(selectCombat.equals("H")) {
					System.out.println("You hit!");
					this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
					afterHit();
				    if(this.getObstacle().getHealth() > 0) {
				    	System.out.println();
				    	System.out.println("You have been hit!");
				    	int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
				    	if(obstacleDamage < 0) {
				    		obstacleDamage = 0;
				    	}
				    	this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
				    	afterHit();
				    }
				}else{
					return false;
				}
				
			}
			if(this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
				System.out.println("You defeated the monster!");
				System.out.println("You win the "+this.getObstacle().getAward()+" money!");
				this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward() );
				System.out.println("Current balance : "+this.getPlayer().getMoney());
			}else {
				return false;
			}
			
		}
		return true;
	}
	public void afterHit() {
		System.out.println("Your health : "+this.getPlayer().getHealth());
		System.out.println(this.getObstacle().getName() +" 's Health : "+this.getObstacle().getHealth());
		System.out.println();
	}
	
	public void playerStats() {
		System.out.println();
		System.out.println("Player State");
		System.out.println("-------------------");
		System.out.println("Health : "+ this.getPlayer().getHealth());
		System.out.println("Damage : "+ this.getPlayer().getTotalDamage());
		System.out.println("Money : "+ this.getPlayer().getMoney());
		System.out.println("Weapon : "+ this.getPlayer().getInventory().getWeapon().getName());
		System.out.println("Armor : "+ this.getPlayer().getInventory().getArmor().getName());
		System.out.println("Block : "+ this.getPlayer().getInventory().getArmor().getBlock());
	}

	public void obstacleStats(int i) {
		System.out.println();
		System.out.println(i+". "+this.getObstacle().getName() + " State" );
		System.out.println("-------------------");
		System.out.println("Health : "+ this.getObstacle().getHealth());
		System.out.println("Damage : "+ this.getObstacle().getDamage());
		System.out.println("Award : "+ this.getObstacle().getAward());
	}
	public Obstacle getObstacle() {
		return obstacle;
	}


	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}


	public String getAward() {
		return award;
	}


	public void setAward(String award) {
		this.award = award;
	}

	public int getMaxObstacle() {
		return maxObstacle;
	}

	public void setMaxObstacle(int maxObstacle) {
		this.maxObstacle = maxObstacle;
	}


	
}
