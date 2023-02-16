package single.inheritance;
import java.util.Scanner;
public class AverageMarks extends Student{
	float avg;
	public void average()
	{
		marks(mark1,mark2,mark3);
		avg=(mark1+mark2+mark3)/3;
		System.out.println("average mark of student is : "+avg);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("enter student name : ");
		String studentName=sc.nextLine();
		System.out.println("enter student ID: ");
		int studentId=sc.nextInt();
		System.out.println("enter student Class: ");
		int classNumber=sc.nextInt();
		System.out.println("enter student division: ");
		sc.nextLine();
		String division=sc.nextLine();		
		System.out.println("enter mark1: ");
		int m1=sc.nextInt();
		System.out.println("enter mark2: ");
		int m2=sc.nextInt();
		System.out.println("enter mark2: ");
		int m3=sc.nextInt();		
		AverageMarks obj = new AverageMarks();
		obj.studentDetails(studentName,studentId,classNumber,division);
		obj.marks(m1,m2,m3);
		System.out.println("------Student details-----");
		obj.showDetails();
		obj.average();	
	}

}
