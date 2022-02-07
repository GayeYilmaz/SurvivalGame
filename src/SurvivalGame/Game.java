package SurvivalGame;

import java.util.Scanner;

public class Game {
	private Player player;
	private Location location;
	
	Scanner scan = new Scanner(System.in);
	public Game() {
		super();
	} 
	
	public Game(Player player, Location location) {
		super();
		this.player = player;
		this.location = location;
	}
	

	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void start() {
		System.out.println("Welcome to Survival Game");
		System.out.print("Please enter name:");
	    Player player= new Player("Gaye");
	    System.out.println("Welcome Gaye!");
	    System.out.println("Characters");
	    player.selectChar();
	    
	    Location location = null;
	    while(true) {
	    	player.printInfo();
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println();
	    	System.out.println("#############Areas#############");
	    	System.out.println();
	    	System.out.println("1 - Safe House");
	    	System.out.println("2 - ToolStore");
	    	System.out.println("Please choose the are that you want to go!");
	    	int loc = scan.nextInt();
	    	switch(loc) {
	    	case 1: 
	    		location = new SafeHouse(player);
	    		break;
	    	case 2:
	    		location = new Toolstore(player);
	    		break;
	    	default:
	    		location = new SafeHouse(player);
	    		break;
	    	}
	    	//location.onLocation();
	    	if(!location.onLocation()) {
	    		System.out.println("GAME OVER !!");
	    		break;
	    	}
	    }
		
	}
	
	
	
	
}
