package heirarchical.inheritance;

public class C extends A {
	public void decrement()
	{
		number--;
		System.out.println("number is :"+number);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		C obj1 = new C();
		obj1.decrement();
	
	}

}
