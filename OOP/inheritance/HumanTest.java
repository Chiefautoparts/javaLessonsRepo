class HumanTest {
	public void startSleeping(){
		System.out.println("Toss and turn");
	}
	
	public static void main(String[] args){
		Human huewMann = new Human();
		huewMann.regulateTemperature();
		huewMann.startSleeping();
		huewMann.goToWork();
		boolean sleeping = huewMann.isSleeping();

		if (sleeping){
			System.out.println("The human is sleeping!");
		}
	}
}