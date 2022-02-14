package SurvivalGame;

public class Mine extends BattleLoc{
	public static boolean complete = false;
	public Mine(Player player) {
		super(player, "Mine", new Snake(), "Money,Weapon and Armor", 5,complete);
		// TODO Auto-generated constructor stub
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		Mine.complete = complete;
	}

}
