public class ProjectTest {
	public static void main(String[] args){
		Project projectOne = new Project();
		Project projectTwo = new Project("Great Project");
		Project projectThree = new Project("Best Project", "This project is the greatest by far");
		System.out.println(projectOne.elevatorPitch());
		System.out.println(projectTwo.elevatorPitch());
		System.out.println(projectThree.elevatorPitch());
	}
}