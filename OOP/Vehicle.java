public class Vehicle {
	private int numberOfWheels;
	private String color;
	// New Vehicle()
	public Vehicle(){

	}
	// new Vehicle("someColor")
	public Vehicle(String color){
		// setting the color attribute to the value from the color parameter
		this.color = color;
	}

	// new vehicle("someColor", 4)
	public Vehicle(String color, int num){
		this.color = color;
		this.numberOfWheels = num;
	}

	// getter
	public int getNumberOfWheels(){
		return numberOfWheels;
	}

	// setter
	public void setNumberOfWheels(int num){
		numberOfWheels = num;
	}

	// getter 
	public String getColor(){
		return color;
	}

	// setter
	public void setColor(String color){
		this.color = color;
	}
}