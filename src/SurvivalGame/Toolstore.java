package SurvivalGame;

public class Toolstore extends NormalLoc {
	public Toolstore(Player player) {
		super(player, "Toolstore");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onLocation() {
		System.out.println("------Welcome to the toolstore!------");
		System.out.println("1 - Weapons");
		System.out.println("2 - Armors");
		System.out.println("3 - Exit");
		System.out.print("Your choise :");
		int selectCase = scan.nextInt();
		while(selectCase <1 || selectCase>3) {
			System.out.println("This is invalid ! Choose again!");
			selectCase = scan.nextInt();
		}
		
		switch (selectCase) {
		case 1:
			printWeapon();
			buyWeapon();
			break;
		case 2:
			printArmor();
			break;
		case 3:
			System.out.println("Come back anytime!");
			return true;
		}
		return true;
		
	}
	
	public void printWeapon() {
		
		System.out.println("----------Weapons----------");
		System.out.println();
		for(Weapon w:Weapon.weapons  ()) {
			System.out.println(w.getId()+" - "+w.getName()+"  <Money : "+w.getPrice()+" , Damage : "+w.getDamage()+">");
		}
		
		
	}
	
	public void buyWeapon() {
		System.out.print("Choose a weapon : ");
		int selectWeaponID = scan.nextInt();
		
		while (selectWeaponID < 1 || selectWeaponID > Weapon.weapons().length) {
			System.out.println("This is invalid value, enter again !");
			selectWeaponID = scan.nextInt();
		}
		
		Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID); 
		
		if(selectedWeapon != null) {
			if(selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
				System.out.println("There is no money!");
			}else {
				System.out.println("You bought "+selectedWeapon.getName()+"!");
				int balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
				this.getPlayer().setMoney(balance);
				System.out.println("Your money :" +this.getPlayer().getMoney());
				System.out.println("The past weapon : "+this.getPlayer().getInventory().getWeapon().getName());
				
				this.getPlayer().getInventory().setWeapon(selectedWeapon);
			}
		}
		
		
		
		
	}
	public void printArmor() {
		System.out.println("----------Armors----------");
	}
	public void menu() {
		
	}
	


}
