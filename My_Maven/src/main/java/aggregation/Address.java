package aggregation;

public class Address {
	private String houseName;
	private int houseNo;
	private int pinNo;
	private String place;
	
	private Student std;
	

	public Student getStd() {
		return std;
	}


	public void setStd(Student std) {
		this.std = std;
	}


	public String getHouseName() {
		return houseName;
	}


	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}


	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public int getPinNo() {
		return pinNo;
	}


	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}
	public void display()
	{
		System.out.println("student name : "+std.getStudName());
		System.out.println("student roll number : "+getStd().getRollNo());
		
		System.out.println("house name : "+houseName);
		System.out.println("house number : "+ getHouseNo());
		System.out.println("house city : "+ getPlace() );
		System.out.println("house pin number : "+getPinNo());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
