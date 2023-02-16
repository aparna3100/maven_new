package single.inheritance;

public class Student {
	static String schoolName="St.Thomas";
	String studentName;
	int studentId,classNumber ;
	String division;
	int mark1,mark2,mark3;
	public void studentDetails(String studentName,int studentId,int classNumber,String division)
	{
		this.studentName= studentName;
		this.studentId=studentId;
		this.classNumber=classNumber;
		this.division=division;
	}
	public void marks(int mark1,int mark2,int mark3)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void showDetails()
	{
		//studentDetails(studentName,studentId,classNumber,division);
		System.out.println("student name is : "+studentName);
		System.out.println("student id  is : "+studentId);
		System.out.println("student class number is : "+classNumber);
		System.out.println("student class division is : "+division);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
