package employee.inheritance;

import java.util.Scanner;

public class TotalSalary extends Hra {
	float total;
	public  void totalSalary()
	{		
		hraPfcal();
		total = basicPay + hraAmount - pfAmount - deduction + bonus;	
	}
	public void salarySlip()
	{
		 System.out.println(     "basic pay: " + basicPay +
                 "\ndeduction: " + deduction +
                 "\nhra: " + hraAmount +
                 "\npf: " + pfAmount +
                 "\nbonus: " + bonus +
                 "\ntotal salary: " + total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic pay : ");
		float basicP = sc.nextFloat();
		System.out.println("enter the deduction : ");
		float dedtn = sc.nextFloat();
		System.out.println("enter the bonus : ");
		float bons = sc.nextFloat();
		
		TotalSalary obj3 = new TotalSalary();
		obj3.employeeSalary(basicP, dedtn, bons);
		obj3.hraPfcal();
		obj3.totalSalary();
		System.out.println();
		obj3.salarySlip();
		
	}
}
