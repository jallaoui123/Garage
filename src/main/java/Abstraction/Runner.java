package Abstraction;

public class Runner {

	public static void main(String[] args) {
		Animal a = new MallaDuck();
		
		DanceBehaviour danceBehaviour = (DanceBehaviour) a ;
		danceBehaviour.dance();
		
		BeakBehaviour beakBehaviour = new MallaDuck();
		beakBehaviour.quack();
		
		

	}
	
	

}
