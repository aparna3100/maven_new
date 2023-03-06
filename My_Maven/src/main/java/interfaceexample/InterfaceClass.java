package interfaceexample;

public class InterfaceClass extends InterfaceClass2 implements SampleInterface3{

	public void show()
	{
		System.out.println("InterfaceClass 1 method 1 ");
	}

	public void display() 
	{
		System.out.println("SampleInterface 1 method 1 "+MAX);
		
	}
	
	public int print(int num) {
		num+=MAX;
		System.out.println("sampleinterface 2 method 1 "+num);
		return 0;
	}
	public float print2(float num)
	{
		num+=MIN;
		System.out.println("sampleinterface 2 method 2 "+num);
		return 0;
	}
	public void print3() {
		System.out.println("sampleinterface 3 method 1 "+MIN_VAL);
		
	}
	public void sayHello() {
		System.out.println("HELLO!");
		
	}
	public static void main(String[] args) 
	{
		InterfaceClass obj = new InterfaceClass();
		obj.sayHello();
		obj.show();
		obj.display();
		
		obj.print(100);
		obj.print2(35);
		obj.print3();
		obj.show1();
	}
	
	

}
