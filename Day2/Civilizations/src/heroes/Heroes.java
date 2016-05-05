package heroes;

import artifacts.Artifacts;
import villains.Villain;

public class Heroes {
	
	public int		health;
	public String	heroType;
	public float	level;
	public int		atack;
	public float	defense;
	
	public Heroes(float level, String heroType){
		
		this.heroType = heroType;
		this.level = level;
		this.health = calculateHealth(level, heroType);
		this.atack = calculateAtack(level, heroType);
		this.defense = calculateDefense(level, heroType);
	}
	
	public String toString(){
		return ("You have selected the " + this.heroType + " class!" + "\nYour current level is: " + this.level) +
			"\nYour current health is: " + this.health + "\nYour current atack power is: " + this.atack +
			"\nYour heroes defense is : " + this.defense;
	}
	
	public Heroes calculateStatsWithArtifact(float level, Heroes newHero, Artifacts newArtifact){
		if (newArtifact.itemType == 0 || newArtifact.itemType == 1){
			newHero.health = newHero.health + newArtifact.health;
			newHero.defense = newHero.defense + newArtifact.defense;
		}
		else if (newArtifact.itemType == 2 && newHero.heroType.compareToIgnoreCase("Orc") == 0 ||
		newArtifact.itemType == 3 && newHero.heroType.compareToIgnoreCase("Knigth") == 0 ||
		newArtifact.itemType == 4 && newHero.heroType.compareToIgnoreCase("Elf") == 0 ||
		newArtifact.itemType == 5 && newHero.heroType.compareToIgnoreCase("Mage") == 0){
			newHero.atack = newHero.atack + newArtifact.atack;
		}
		else
			return null;
		return newHero;
	}
	
	public int		healthAfterFigth(Heroes newHero){
		
		int		resultingHealth;
		int		villianHealth;
		int		aux;
		
		Villain newVillian = new Villain(newHero.level);
		System.out.println(newVillian.toString());
		villianHealth = newVillian.health;
		resultingHealth = newHero.health;
		while (resultingHealth > 0 && villianHealth > 0){
			aux = (int)(newHero.defense - newVillian.atack);
			if (aux < 0){
			resultingHealth = (int)(resultingHealth + aux);
			}
			aux = (int)(newVillian.defense - newHero.atack);
			if (aux < 0)
			villianHealth = (int)(villianHealth + aux);
		}
		
		return resultingHealth;
	}
	
	public float calculateDefense(float level, String heroType){
		float		result;
		
		if (heroType.compareToIgnoreCase("orc") == 0)
			result = (level);
		else if (heroType.compareToIgnoreCase("knigth") == 0)
			result = (float) ((level * 3.5) + 45);
		else if (heroType.compareToIgnoreCase("elf") == 0)
			result = (level * 3) + 45;
		else
			result = (level * 3) + 45;
		
		return result;
	}
	
	public int	calculateHealth(float level, String heroType){
		int		result;
		
		if (heroType.compareToIgnoreCase("orc") == 0)
			result = (int) ((level * 5) + 40);
		else if (heroType.compareToIgnoreCase("knigth") == 0)
			result = (int) ((level * 4) + 35);
		else if (heroType.compareToIgnoreCase("elf") == 0)
			result = (int) ((level * 3) + 30);
		else
			result = (int) ((level * 3) + 25);
		
		return result;
	}
	
	public int	calculateAtack(float level, String heroType){
		
		int		result;
		if (heroType.compareToIgnoreCase("orc") == 0)
			result = (int) ((level * 3) + 30);
		else if (heroType.compareToIgnoreCase("knigth") == 0)
			result = (int) ((level * 3) + 30);
		else if (heroType.compareToIgnoreCase("elf") == 0)
			result = (int) ((level * 4) + 35);
		else
			result = (int) ((level * 4) + 40);
		
		return result;
	}
}
