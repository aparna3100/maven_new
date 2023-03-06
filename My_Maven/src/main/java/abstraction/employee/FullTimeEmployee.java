package abstraction.employee;

public class FullTimeEmployee extends Employee
{
	public  void display2()
	{
		System.out.println("Full Time Employee Salary");
	}
	
	public double calculateSalary()
	{
		// TODO Auto-generated method stub
		 double grossSalary=30000;
		 double incomeTax=3000; 
		 double	providentFund=2400;    
		 double professionalTax=1500;
		 double netSalaryMonthly=grossSalary-(incomeTax+providentFund+professionalTax);
		 
		 System.out.println("Net Salary Monthly is="+netSalaryMonthly);
		 // hourly wage =($5000 per month * 12 / 52 weeks) / 40 hours per week = $28.85
		 double hourlySalary=(netSalaryMonthly*12/52)/40;
		 System.out.println("Hourly Salary is="+hourlySalary);
		 final int HOUR=8;
		 double dailySalary=hourlySalary*HOUR;
		 System.out.println("Daily Salary is="+dailySalary);
		 return 0;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj1.display();
		obj1.display2();
		obj1.calculateSalary();
	}

}
