package artifacts;

import java.util.Random;

public class Artifacts {
	public int 		health;
	public String	artifactName;
	public int		itemType;
	public int		requiredLevel;
	public int		atack;
	public float	defense;
	
	public Artifacts(int level){
		
	    Random rand = new Random();
	    Random rand1 = new Random();
	    
	    this.requiredLevel = rand.nextInt(level + 4);
	    this.itemType = rand1.nextInt(5);
		if (itemType == 0){
			this.artifactName = "Helmet";
			this.health = (level * 2) + 10;
			this.atack = 0;
			this.defense = (level * 2) + 15;
		}
		else if (itemType == 1){
			this.artifactName = "Armor";
			this.health = (level * 2) + 25;
			this.atack = 0;
			this.defense = (level * 2) + 20;
		}
		else if (itemType == 2){
			this.artifactName = "Axe";
			this.health = 0;
			this.atack = (level * 2) + 15;
			this.defense = 0;
		}
		else if (itemType == 3){
			this.artifactName = "Sword";
			this.health = 0;
			this.atack = (level * 2) + 20;
			this.defense = 0;
		}
		else if (itemType == 4){
			this.artifactName = "Bow";
			this.health = 0;
			this.atack = (level * 2) + 25;
			this.defense = 0;
		}
		else {
			this.artifactName = "Staff";
			this.health = 0;
			this.atack = (level * 2) + 27;
			this.defense = 0;
		}
	}
}