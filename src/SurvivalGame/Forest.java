package SurvivalGame;

public class Forest extends BattleLoc {

	public static boolean complete = false;
	public Forest(Player player) {
		super(player, "Forest", new Vampire(), 	"Firewood",3,complete);
		// TODO Auto-generated constructor stub
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		Forest.complete = complete;
	}
	
	

}
