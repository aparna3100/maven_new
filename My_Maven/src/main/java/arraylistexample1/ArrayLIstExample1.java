package arraylistexample1;

import java.util.ArrayList;

public class ArrayLIstExample1 {
	//create a new array list
	ArrayList<String> ls = new ArrayList<String>();
	//add some colors (string) and print out the collection
	public void colors()
	{
		ls.add("Violet");
		ls.add("Indigo");
		ls.add("Blue");
		ls.add("Green");
		ls.add("Yellow");
		ls.add("Orange");
		ls.add("Red");
		System.out.println("list of colors "+ls);
	}
	//to retrieve an element (at a specified index) from a given array list
	public void retrieve ()
	{
		System.out.println();
		String element = ls.get(1);
		System.out.println("Second element: "+element);
		element = ls.get(5);
		System.out.println("Sixth element: "+element);
	}
	//to iterate through all elements in an array list
	public void iterate()
	{
		System.out.println();
		System.out.println("List after iteration");
		for (String element : ls)
		{
		    System.out.println(element);
		}
	}
	//remove the third element from an array list
	public void remove()
	{
		System.out.println();
		ls.remove(3);
		System.out.println("List after removing third element "+ls  );
	}
	//search an element in an array list
	public void search()
	{
		System.out.println();
		if(ls.contains("Yellow"))
			 System.out.println("Element Found");
		else 
			 System.out.println("There is no such element");
	}
	
	public static void main(String[] args) 
	{
		ArrayLIstExample1 obj = new ArrayLIstExample1();
		obj.colors();
		obj.retrieve();
		obj.iterate();
		obj.remove();
		obj.search();
	}
}
