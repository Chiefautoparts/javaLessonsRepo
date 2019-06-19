class Car {
	String make;
	String model;
	String color;
	boolean engineStarted;
	void engineState(){
		if (engineStarted == true)
		{
			System.out.println("The engine is already turned on.");
		} else {
			engineStarted = false;
			System.out.println("The engine is now turned on.");
		}
	}

	void showAttributes(){
		System.out.println("The car is " + color + " and is a " + make + " " + model);
		if (engineStarted == true){
			System.out.println("The engine is turned on.");
		} else {
			System.out.println("The engine is turned off.");
		}
	}

	public static void main(String args[]){
		Car c = new Car();
		c.make = "Dodge";
		c.model = "Charger";
		c.color = "Orange";
		System.out.println("printing attributes");
		c.showAttributes();
		System.out.println("Starting engine");
		c.engineState();
		System.out.println("Showing attributes");
		c.showAttributes();
	}
}