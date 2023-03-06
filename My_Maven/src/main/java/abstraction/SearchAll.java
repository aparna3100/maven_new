package abstraction;

public class SearchAll extends Google{
	public void search()
	{
		System.out.println("search all ");
	}
	public int print(int n)
	{
		n--;
		System.out.println("num is "+n);
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google obj1 = new SearchAll();
		obj1.sayHello();
		obj1.search();
		obj1.print(30);

	}

}
