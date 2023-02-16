package superexample;

public class Child extends Parent {
	int number;
	public void operate(int num)
	{
		super.number=num;
		super.number*=10;
		number=num;
		
	}
	public void show()
	{
		System.out.println("number"+number);
	}

	public static void main(String[] args) {
		Child obj= new Child();
		obj.operate(30);
		obj.display();
		obj.show();
		// TODO Auto-generated method stub

	}

}
