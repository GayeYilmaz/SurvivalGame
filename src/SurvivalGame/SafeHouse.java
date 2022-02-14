package SurvivalGame;

import java.util.List;

public class SafeHouse extends NormalLoc{
	
	public SafeHouse(Player player) {
		super(player, "Safe House");
	}
	@Override
	public boolean onLocation() {
		
		
		if( this.getPlayer().getInventory().getPrize().contains("Firewood") 
				&&  this.getPlayer().getInventory().getPrize().contains("Water") && 
				 this.getPlayer().getInventory().getPrize().contains("Food")) {
			System.out.println("WINNER!");
			return false;
		}
		else {
			System.out.println("You are in the safe house!");
			System.out.println("Your healt is increased!");
			this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
		}
		
		return true;
	}

}
