package interfacerbi;

public class HDFC implements RBI {
	public double recurringDeposit(double monthlyDeposits, double numberOfMonthsMadePayments) {
		double totalDeposits = monthlyDeposits * numberOfMonthsMadePayments;
		double interest = monthlyDeposits * 12 * (12+1) *INTEREST_RATE/2400;
		double maturityAmount = totalDeposits + interest;
		System.out.println("MATURITY AMOUNT = "+maturityAmount);
		
		return 0;
	}
	
	public static void main(String[] args) 
	{
		HDFC obj = new HDFC();
		obj.recurringDeposit(50000, 12);

	}



}
/*
maturity amount = total deposits + interest
total deposits = monthly deposits * number of months  made payments

interest = P * n * (n +1) / 2 * 1 / 12 * r / 100 //for n months
or interest =  P * n * (n+1) * r / 2400

where:

P is the monthly deposit,
n is number of months,
r is the annual interest rate

*/