// new class declared
public class Execute{
	public static void main(String[] args){
		// Creating a new instance of the Dog class
		Dog germanShepard = new Dog();
		germanShepard.breed = "German Shepard";
		germanShepard.size = "Medium";
		germanShepard.age = 3;
		germanShepard.color = "Gold/Brown";
		System.out.println(germanShepard.getInfo());
	}
}