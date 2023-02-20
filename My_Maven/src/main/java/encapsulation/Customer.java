package encapsulation;

public class Customer extends Bank{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Customer obj = new Customer();
		obj.setCustName("abcd");
		obj.setMoney(10000);
		obj.calculate();
		System.out.println("name "+obj.getCustName());
		System.out.println("money "+obj.getMoney());
	}

}
