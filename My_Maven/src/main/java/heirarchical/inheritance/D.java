package heirarchical.inheritance;

public class D extends A {
	public void division()
	{
		number/=2;
		System.out.println("number is :"+number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B obj = new B();
		//obj.increment();
			
		//C obj1 = new C();
		//obj1.decrement();
	
		
		D obj2 = new D();
		obj2.division();

	}

}
