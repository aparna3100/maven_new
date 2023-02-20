package encapsulation;

public class Bank {
	private double money;
	private String custName;
	
	

	public double getMoney() {
		return money;
	}



	public void setMoney(double money) {
		this.money = money;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void calculate()
	{
		double i = (money * 5 * 8)/100;
		money+=i;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
