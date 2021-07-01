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
		Object vehicle;
		garage.remove(vehicle);
		
	}
  public void clear() {
	    garage.clear();
	    System.out.println("Garage has been cleared!");
	  }

public void setGarage(String string) {
	// TODO Auto-generated method stub
	
}

public void setVehicle(String string) {
	// TODO Auto-generated method stub
	
}

public void setTruck(String string) {
	// TODO Auto-generated method stub
	
}
  

	
	    
}
 
