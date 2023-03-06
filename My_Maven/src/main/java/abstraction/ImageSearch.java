package abstraction;

public class ImageSearch extends Google {
	public void search()
	{
		System.out.println("search all images");
	}
	public int print(int n)
	{
		n++;
		System.out.println("num is "+n);
		return n;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google obj = new ImageSearch();
		obj.sayHello();
		obj.search();
		obj.print(20);

	}

}
