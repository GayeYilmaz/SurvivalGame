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
	    Player player= new Player(scan.nextLine());
	    System.out.println("Welcome "+player.getName()+"!");
	    System.out.println("Characters");
	    System.out.println("------------------------------------------------------------------------------------------");
	    player.selectChar();
	    
	    Location location = null;
	    while(true) {
	    	System.out.println();
	    	player.printInfo();
	    	System.out.println();
	    	Scanner scan = new Scanner(System.in);
	    	//System.out.println("------------------------------------------------------------------------------------------");
	    	System.out.println("Areas");
	    	System.out.println("------------------------------------------------------------------------------------------");
	    	System.out.println("1 - Safe House ->> This is the safe place, there is no enemy!");
	    	System.out.println("2 - ToolStore ->> You can buy armor and weapon in here!");
	    	System.out.println("3 - Cave ->> Award is <Food>. Zombies live in cave!");
	    	System.out.println("4 - Forest ->> Award is <Firewood>. Vampires live in forest!");
	    	System.out.println("5 - River ->> Award is <Water>. Bears live near the river!");
	    	System.out.println("6 - Mine ->> You can get Weaponi Armor or Money. Snakes live in Mine!");
	    	System.out.println("0 - Exit ->> Finish the game!");
	    	System.out.println("------------------------------------------------------------------------------------------");
	    	System.out.print("Please choose the area that you want to go : ");
	    	
	    	int loc = scan.nextInt();
	    	switch(loc) {
	    	case 0:
	    		location = null;
	    		break;
	    	case 1: 
	    		location = new SafeHouse(player);
	    		break;
	    	case 2:
	    		location = new Toolstore(player);
	    		break;
	    	case 3:
	    		location = new Cave(player);
	    		break;
	    	case 4:
	    		location = new Forest(player);
	    		break;
	    	case 5:
	    		location = new River(player);
	    		break;
	    	case 6:
	    		location = new Mine(player);
	    		break;
	    	default:
	    		System.out.println("Please choose valid area!");
	    		//location = new SafeHouse(player);
	    		break;
	    	}
	    	//location.onLocation();
	    	if(location == null) {
	    		System.out.println("See you later!");
	    		break;
	    	}
	    	if(!location.onLocation()) {
	    		System.out.println("GAME OVER !!");
	    		break;
	    	}
	    }
		
	}
	
	
	
	
}
