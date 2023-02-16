package employee.inheritance;
//Program to find the total salary by hand of an employee
//i) Class 1 Get basic pay, deduction and bonus from console.
// ii) Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay).
// iii) Class 3 Find the total salary (basicpay+hra-pf-deduction+bonus) 
//and get the salary slip. Salary slip should contain: - basic pay, deduction, hra, pf, bonus and total salary by hand.
public class Employee {
	float basicPay,deduction,bonus;
	public void employeeSalary(float basicPay,float deduction,float bonus)
	{
		
		this.basicPay=basicPay;
		this.deduction=deduction;
		this.bonus=bonus;		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}

}
