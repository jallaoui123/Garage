package Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {

  private List<Vehicle> garage;

  public Garage() {
    garage = new ArrayList<Vehicle>();
    
  }
  
  public void add(Vehicle vehicle) {
	    garage.add(vehicle);
	  }

  public void removeVehicle(int index) {
		Object vehicle = null;
		garage.remove(vehicle);
		
		
	}
  public void clear() {
	    garage.clear();
	    System.out.println("Garage has been cleared!");
	  }

public void setGarage(String string) {
	
	
}

public void setVehicle(String string) {

	
}

public void setTruck(String string) {
	
	
}
  

	
	    
}
 
