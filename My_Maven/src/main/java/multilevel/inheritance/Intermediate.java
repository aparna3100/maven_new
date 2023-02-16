package multilevel.inheritance;

public class Intermediate extends Parent{
	
	public void print()
	{
		System.out.println("intermediate inheritance");
		System.out.println("name is : "+name);
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		obj.display();
		System.out.println();
		
		Intermediate obj2 = new Intermediate();
		obj2.print();
		obj2.display();
		System.out.println();
		
		Child obj3 = new Child();
		obj3.childMethod();
		obj3.print();
		obj3.display();
	    System.out.println();	
		// TODO Auto-generated method stub

	}

}
