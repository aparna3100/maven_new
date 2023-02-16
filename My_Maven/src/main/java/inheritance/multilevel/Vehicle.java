package inheritance.multilevel;

public class Vehicle { 
	 String model;
	 String manufacturer;
	 double weight;
	 double volume,boreDiameter,strokelength;
	 double noOfCylinders;
	 public void vehicleDetails(String model,String manufacturer,double weight,double volume,double boreDiameter,double strokelength,double noOfCylinders)
	 {
	  this.model=model;
	  this.weight=weight;
	  this.manufacturer=manufacturer;
	  this.volume=volume;
	  this.boreDiameter=boreDiameter;
	  this.strokelength=strokelength;
	  this.noOfCylinders=noOfCylinders;
	  
	 }
	// V = π/4 x (D)² x H x N. Where, V = Volume, D = Bore Diameter, H = Stroke Length, N = No. of Cylinders.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
