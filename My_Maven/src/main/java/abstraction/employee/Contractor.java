package abstraction.employee;

public class Contractor extends Employee
{
	public  void display1()
	{
		System.out.println("Contractor Salary");
	}
		@Override
	public double calculateSalary( ) 
		{
		// TODO Auto-generated method stub
		double grossSalary=10000;
		 double incomeTax=1000; 
		 double	providentFund=800;    
		 double professionalTax=500;
		 double netSalaryMonthly=grossSalary-(incomeTax+providentFund+professionalTax);
		
		 System.out.println("Net Salary Monthly is="+netSalaryMonthly);
		 // hourly wage =($5000 per month * 12 / 52 weeks) / 40 hours per week = $28.85*/
			
		 double hourlySalary=(netSalaryMonthly*12/52)/40;
		System.out.println("Hourly Salary is="+hourlySalary);
		 double dailySalary=hourlySalary*10;
		 System.out.println("Daily Salary is="+dailySalary);
		 return 0;
		}
		 
	public static void main(String[] args)
	{
				// TODO Auto-generated method stub
		 Contractor obj = new Contractor();
		 obj.display();
		 obj.display1();
		 obj.calculateSalary();

	}
	
	
}
