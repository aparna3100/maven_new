package arraylistexample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("arya");
		ls.add("aparna");
		ls.add("arathi");
		ls.add("adithya");
		System.out.println("list "+ls);
		ls.remove(3);
		System.out.println("list after deletion "+ls);
		System.out.println("list size "+ls.size());
		
		Collections.sort(ls);
		System.out.println("list after sorting "+ls);
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		System.out.println("for each loop");
		for(String element:ls)
		{
			System.out.println(element);
		}

	}

}
