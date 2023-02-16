package inheritance;

public class Child extends Parent {
	public void print()
	{
		System.out.println("child inheritance");
		display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.print();
		obj.display();
		
		Parent obj1 = new Parent();
		obj1.display();

	}

}
