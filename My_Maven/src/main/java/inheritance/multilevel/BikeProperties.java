package inheritance.multilevel;

public class BikeProperties extends CarProperties {
	double engineVolume;
	public void bike()
	{
		///this.engineVolume=engineVolume;
		car();
		engineVolume=engineCapacity;
		
		
	}
	public void show()
	{
		System.out.println("engine capacity of bike is : "+engineVolume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeProperties obj1=new BikeProperties();
		obj1.vehicleDetails("bmw","germany",1000,480,84.0,89.6,6);
		obj1.car();
		obj1.display();
		
		BikeProperties obj2 =new BikeProperties();
		obj2.vehicleDetails("Yamaha MT","india",139,10,58.0,58.7,1);
		obj2.bike();
		obj2.show();

	}

}
