package SurvivalGame;

public abstract class BattleLoc extends Location{
	
	private Obstacle obstacle;
	
	
	public BattleLoc(Obstacle obstacle) {
		super();
		this.obstacle = obstacle;
	}


	public boolean onLocation() {
		
	}

	public void combat() {
		
	}
}
