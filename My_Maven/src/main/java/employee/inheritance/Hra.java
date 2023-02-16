package employee.inheritance;

public class Hra extends Employee {	
	float hraAmount,pfAmount;
	public void hraPfcal()
	{
		employeeSalary( basicPay,deduction,bonus);	
		hraAmount = (float) (basicPay * 0.5); 	
		pfAmount = (float) (basicPay * 0.20);	
	}
	public static void main(String[] args) {
		
		
}

}
	