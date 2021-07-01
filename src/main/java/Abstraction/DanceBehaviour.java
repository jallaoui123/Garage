package Abstraction;

public interface DanceBehaviour {
	
	default void dance() {
		System.out.println("Defailt Quack");
	}
	

}
