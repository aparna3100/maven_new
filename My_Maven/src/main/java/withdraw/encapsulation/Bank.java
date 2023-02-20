package withdraw.encapsulation;

public class Bank {
	private int pin;
	double balance=100000;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean validatePin()
	{
		if(pin == 1234 || pin ==1001 || pin ==1212)
			//System.out.println("It is a valid pin");
			return true;
		else
			//System.out.println("Not a valid pin");
			return false;
	}
	public  double  withdraw(double amount)       // makes withdrawal
	{
		System.out.println("Account balance : " +balance);
		double wdAmount = 0;
		if(balance>=amount)
			 wdAmount = balance - amount;
		else
			System.out.println("withdraw not possible");
		System.out.println("Account balance after withdrawal : ");
		return wdAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//II. Program to withdraw amount from an ATM. 
//a) Class 1- Bank One method to set pin from „User‟ class and validate Pin in another method. 
//[Valid pins – 1001, 1234, 1212] 
//Pin number should declare as private. 
//b) Class 2 – User Get the pin from User.