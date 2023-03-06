package abstraction;

public class VideoSearch extends Google {

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("search all videos");
	}

	@Override
	public int print(int num) {
		// TODO Auto-generated method stub
		num/=5;
		System.out.println("num is "+num);
		return 0;
	}
	public void display()
	{
		System.out.println("method in videosearch");
	}
	public static void main(String[] args)
	{
		VideoSearch obj2=new VideoSearch();
		obj2.sayHello();
		obj2.search();
		obj2.print(45);
		obj2.display();
	}
	

}
