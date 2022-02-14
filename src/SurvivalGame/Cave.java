package SurvivalGame;

public class Cave extends BattleLoc{
	public static boolean complete = false;
	public Cave(Player player) {
		super(player, "Cave", new Zombie(), "Food",3,complete);
		// TODO Auto-generated constructor stub
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		Cave.complete = complete;
	}

}
