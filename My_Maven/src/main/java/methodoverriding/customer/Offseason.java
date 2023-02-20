package methodoverriding.customer;

import java.util.Scanner;

public class Offseason extends Onseason{
	public double discount(double cost)
	{
		
		double discount = cost *0.15;
		return discount;
	}
	public void displayOffseason()
	{
		System.out.println("off season discount "+discount(500));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter 1 if offseason , enter 2 if on season");
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int x =sc.nextInt();
		switch(x)
		{
		case 1:
			Offseason obj1= new Offseason();
			obj1.displayOffseason();
			break;
		case 2:
			Onseason obj2 = new Onseason();
			obj2.displayOnseason();
			break;
		default:
			System.out.println("invalid");
			
			
			
		}

	}

}
