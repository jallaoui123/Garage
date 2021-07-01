package Car;

public class Vehicle {
	
		  private int rims;
		  private int speedLimit;
		  private String model;

		  public int getRims() {
			return rims;
		}

		public void setRims(int rims) {
			this.rims = rims;
		}

		public int getSpeedLimit() {
			return speedLimit;
		}

		public void setSpeedLimit(int speedLimit) {
			this.speedLimit = speedLimit;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Vehicle(int rims, int speedLimit, String model) {
		    this.rims = rims;
		    this.speedLimit = speedLimit ;
		    this.model = model;
		  }

		@Override
		public String toString() {
			return "Vehicle [rims=" + rims + ", speedLimit=" + speedLimit + ", model=" + model + "]";
		}
		
		


}
