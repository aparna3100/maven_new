package exceptionexample;

public class ExceptionExample1 {
	float res;
	public void operation(int n1,int n2) //throws Exception
	{
		float res;
		int arr[] = new int[5];
		try
		{
			res=n1/n2;
			System.out.println("result : "+res);
			for(int i=0;i<=5;i++)
			{
				arr[i]=i+1;
				System.out.println(arr[i]);
			}
		}
			//System.exit(0);

		catch(ArithmeticException ex)
		{
			System.out.println("division not possible by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("array size is 5");
		}
		catch(Exception ex)
		{
			System.out.println("exception occured");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("end");
		
	}
	
	

	public static void main(String[] args) //throws Exception
	{
		// TODO Auto-generated method stub
		ExceptionExample1 obj = new ExceptionExample1();
		obj.operation(200, 25);
	}

}
