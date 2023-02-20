package methodoverriding;

public class Child extends Parent {
	public int operation(int n1,int n2)
	{
		System.out.println("parent result "+super.operation(20, 30));
		int mul = n1*n2;
		return mul;
	}
	public void show()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Child obj = new Child();
		System.out.println("child result "+ obj.operation(30, 40));
		obj.show();
		obj.display();	
		
		Parent obj1 = new Parent();
		System.out.println("parent result "+obj1.operation(30, 50));
		obj.display();
		*/

		Parent obj = new Child();
		System.out.println("child result "+ obj.operation(30, 40));
		obj.display();
		
	}

}
