public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla has thrown something.");
		energyLevel = energyLevel - 5;
	}

	public void eatBananas(){
		System.out.println("The gorilla seems very happy while eating the bananas");
		energyLevel = energyLevel + 10;
	}

	public void climb() {
		System.out.println("he gorilla is climbing up a tree.");
		energyLevel = energyLevel - 10;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}
}