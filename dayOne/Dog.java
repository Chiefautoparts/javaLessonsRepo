// Class Declaration
public class Dog {
	// Instance Variables
	// Characteristics that all dogs share
	String breed;
	String size;
	int age;
	String color;

	// Methods
	// Actions that dogs can perform
	public String getInfo(){
		return ("Breed: " + breed + "Size: " + size + "Age: " + age + "Color: " + color);
	}

	public static void main(String[] args){
		// Creating a new instance of the Dog class
		Dog germanShepard = new Dog();
		germanShepard.breed = "German Shepard";
		germanShepard.size = "Medium";
		germanShepard.age = 3;
		germanShepard.color = "Gold/Brown";
	}
}