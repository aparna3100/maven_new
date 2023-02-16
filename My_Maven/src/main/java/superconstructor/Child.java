package superconstructor;

public class Child extends Parent{
	int number1;
	public Child(int num1)
	{
		super(35);
		number1=num1;
		System.out.println("child class constructor "+number1);
		
	}
	public void show()
	{
		System.out.println("no argument child  method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child(30);
		obj.display();
		obj.show();
	}

}
