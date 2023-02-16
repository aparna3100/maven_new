package heirarchical.inheritance;

public class B extends A {
	public void increment()
	{
		number++;
		System.out.println("number is :"+number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.increment();

	}


}
