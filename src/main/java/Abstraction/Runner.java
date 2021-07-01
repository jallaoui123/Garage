package Abstraction;

public class Runner {

	public static void main(String[] args) {
		Animal a = new Duck();
		
		DanceBehaviour danceBehaviour = (DanceBehaviour) a ;
		danceBehaviour.dance();
		
		BeakBehaviour beakBehaviour = new Duck();
		beakBehaviour.quack();
		
		

	}

}
