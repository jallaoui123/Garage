package Abstraction;

public abstract class Animal {
	
	private String species;
	private String animalType;
	
	public Animal() {
		this("unknown");
		
	}
	public Animal(String species) {
		
	}
	
public void wakeup() {
	System.out.println("Im Awake");
	
	
}
	
	

	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	
	

}
