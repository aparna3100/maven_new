package exceptionexample;

import java.io.IOException;

public class ExceptionExample2 {
	public void operations(int n1,int n2) 
	{
		int result;
		result=n1+n2;
		System.out.println("result is:"+result);
		try
		{
			if(result>0)
			{
				throw new ArithmeticException();
			}
			else
			{
				throw new IOException();
			}
			
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample2 obj = new ExceptionExample2();
		obj.operations(1, 1);
	} 

}
