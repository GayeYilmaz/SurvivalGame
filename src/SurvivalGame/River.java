package SurvivalGame;

public class River extends BattleLoc {
	public static boolean complete = false;
	public River(Player player) {
		super(player, "River", new Bear(), "Water",2,complete);
		// TODO Auto-generated constructor stub
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		River.complete = complete;
	}
	

}
