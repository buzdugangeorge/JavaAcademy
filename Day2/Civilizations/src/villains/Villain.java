package villains;

import java.util.Random;

public class Villain {
	public int 		health;
	public int		villainNumber;
	public String	villainName;
	public float	level;
	public int		atack;
	public float	defense;
	
	public Villain(float level){
		
	    Random rand = new Random();
	    
	    this.level = level;
	    this.villainNumber = rand.nextInt(3);
	    
	    if (villainNumber == 0){
	    	this.villainName = "Devil";
	    	this.health = (int)((level * 3) + 20);
	    	this.atack = (int)(int)((level * 3)+ 6);
	    	this.defense = (int)((level * 1.25) + 25);
	    }
	    else if (villainNumber == 1){
	    	this.villainName = "Goblin";
	    	this.health = (int)((level * 3) + 15);
	    	this.atack = (int)((level * 3)+ 6);
	    	this.defense = (int)((level * 1.25) + 27);
	    }
	    else if (villainNumber == 2){
	    	this.villainName = "Necromancer";
	    	this.health = (int)((level * 3) + 10);
	    	this.atack = (int)(int)((level * 3)+ 6);
	    	this.defense = (int)((level * 1.25) + 20);
	    }
	    else {
	    	this.villainName = "Dark Mage";
	    	this.health = (int)((level * 3) + 15);
	    	this.atack = (int)(int)((level * 3)+ 6);
	    	this.defense = (int)((level * 1.25) + 20);
	    }
	}
	
	public String toString(){
		return "Goblin current level is: " + level + "\nGoblin current health is: " + this.health +
				"\nGoblin current atack power is: " + this.atack  + "\nGoblin defense is : " + this.defense;
	}
}