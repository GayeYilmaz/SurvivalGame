package SurvivalGame;

import java.util.Random;

public class Snake extends Obstacle{
	public static Random r = new Random();
	public Snake() {
		super("Snake", 4, r.nextInt(3)+3, 12, 0);
		
	
		
		
		// TODO Auto-generated constructor stub
	}

}
