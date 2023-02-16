package inheritance.multilevel;

public class CarProperties extends Vehicle {
	double engineCapacity;
	public void car()
	{
		//this.engineCapacity=engineCapacity;
		vehicleDetails(model,manufacturer,weight,volume,boreDiameter,strokelength,noOfCylinders);
		
		engineCapacity=(3.14/4)*(boreDiameter*boreDiameter)*strokelength*noOfCylinders;
		
		
	}
	public void display()
	{
		System.out.println("engine capacity of car is : "+engineCapacity);
	}
	

}
