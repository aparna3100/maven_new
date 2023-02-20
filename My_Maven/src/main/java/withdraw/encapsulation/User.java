package withdraw.encapsulation;
import java.util.Scanner;
public class User extends Bank{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[Valid pins – 1001, 1234, 1212]");
		System.out.println("Enter pin number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int pinNum=sc.nextInt();
		
		User obj = new User();
		obj.setPin(pinNum);
		System.out.println("Entered Pin is "+obj.getPin());
		if(obj.validatePin())
		{
			System.out.println("Enter withdraw Amount");
			double withdrawal=sc.nextDouble();
			System.out.println(obj.withdraw(withdrawal));

		}
		else
			System.out.println("invalid pin");
		
				
	}

}
