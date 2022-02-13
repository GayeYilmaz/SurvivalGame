package SurvivalGame;

public class Toolstore extends NormalLoc {
	public Toolstore(Player player) {
		super(player, "Toolstore");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
	    System.out.println();
	    boolean showMenu = true;
		while(showMenu) {
			System.out.println("Welcome to the toolstore!");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("1 - Weapons");
			System.out.println("2 - Armors");
			System.out.println("3 - Exit");
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.print("Your choose : ");
			int selectCase = scan.nextInt();
			while(selectCase <1 || selectCase>3) {
				System.out.print("This is invalid ! Choose again : ");
				selectCase = scan.nextInt();
			}
			
			switch (selectCase) {
			case 1:
				printWeapon();
				buyWeapon();
				break;
			case 2:
				printArmor();
				buyArmor();
				break;
			case 3:
				System.out.println("Come back anytime!");
				showMenu = false;
				break;
			}
			
		}
		return true;
	}
	
	public void printWeapon() {
		
		System.out.println("----------Weapons----------");
		System.out.println();
		for(Weapon w:Weapon.weapons  ()) {
			System.out.println(w.getId()+" - "+w.getName()+"  <Money : "+w.getPrice()+" , Damage : "+w.getDamage()+">");
		}
		
		System.out.println("0 - Exit");
	}
	
	public void buyWeapon() {
		System.out.print("Choose a weapon : ");
		int selectWeaponID = scan.nextInt();
		
		while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
			System.out.print("This is invalid value, choose again : ");
			selectWeaponID = scan.nextInt();
		}
		if(selectWeaponID != 0) {
			Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID); 
			
			if(selectedWeapon != null) {
				if(selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("There is no money!");
				}else {
					System.out.println("You bought "+selectedWeapon.getName()+"!");
					int balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					
					//System.out.println("The past weapon : "+this.getPlayer().getInventory().getWeapon().getName());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println("Current balance :" +this.getPlayer().getMoney());
				
				}
			}
		
		
		}
		
		
		
		
	}
	public void printArmor() {
		System.out.println("----------Armors----------");
		for(Armor a : Armor.armors()) {
			System.out.println(a.getId()+" - "+a.getName()+" <Block : "+a.getBlock()+", Price : "+a.getPrice()+">");
		}
		System.out.println("0 - Exit");
	}
	
	public void buyArmor() {
		System.out.print("Choose an armor :");
		
		int selectedArmorID = scan.nextInt();
		
		while(selectedArmorID < 0 || selectedArmorID > Armor.armors().length) {
			System.out.print("This is invalid value, enter again : ");
			selectedArmorID = scan.nextInt();
		}
		
		if(selectedArmorID != 0) {
			Armor selectedArmor = Armor.getArmorObjByID(selectedArmorID);
			
			if(selectedArmor != null) {
				
				if(selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("There is no money !");
				}
				else {
					System.out.println("You bought "+selectedArmor.getName()+"!");
					int balance = this.getPlayer().getMoney()-selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					this.getPlayer().getInventory().setArmor(selectedArmor);
					System.out.println("Current balance : "+this.getPlayer().getMoney());
				}
			}
		}
	}
	public void menu() {
		
	}
	


}
