package Car;

public class Motorbike extends Vehicle {
	
	public Motorbike(int rims, int speedLimit, String model) {
		super(rims, speedLimit, model);
 
	}

	private String engineSize;
	private String colour;
	

	
	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}


