package Abstraction;

public interface DanceBehaviour {
	
	default void dance() {
		System.out.println("Default Quack");
	}
	

}
