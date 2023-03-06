package exceptionexample;

import java.io.IOException;

public class ExceptionExample3 {
	float result;
	public void operation(int n1,int n2) throws IOException
	{
		int result;
		result=n1+n2;
			if(result>0)
			{
				throw new ArithmeticException();
			}
			else
			{
				throw new IOException();
			}
	}
		

	public void print() throws IOException
	{
		operation(10,0);
;		System.out.println("result : "+result);

	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ExceptionExample3 obj = new ExceptionExample3();
		try
		{
		obj.print();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("result > 0");
		}
		catch(IOException ex)
		{
			System.out.println("result < 0");
		}
	}

}
