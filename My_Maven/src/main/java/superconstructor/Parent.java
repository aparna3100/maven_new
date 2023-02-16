package superconstructor;

public class Parent {
	int number;
	public Parent(int num)
	{
		number=num;
		System.out.println("parent class constructor"+number);
	}
	public void display()
	{
		System.out.println("no argument parent method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
