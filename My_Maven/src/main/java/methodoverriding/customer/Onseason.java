package methodoverriding.customer;

public class Onseason {
	
	public double  discount(double cost)
	{
		double discount =cost* 0.4;
		return discount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void displayOnseason() {
		// TODO Auto-generated method stub
		System.out.println("on season discount "+discount(1000));
	}

}
//I. Program to calculate discount. 
//If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
//a) Should use two classes, Onseason and Offseason 
//b) Use two methods- discount (method name should be same)