package superaddition;

public class AdditionDivisible extends AdditionResult{
	float result;
	public void divisible()
	{
		result=super.result%10;
		
	}
	public void display()
	
	{
		if(result==0)
			System.out.println("divisible  by 10");
		else
			System.out.println("not divisible  by 10");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionDivisible obj = new AdditionDivisible();
		float result1=obj.addition(24,44);
		System.out.println("addition result is  : "+result1);
		obj.divisible();
		obj.display();

	}

}
