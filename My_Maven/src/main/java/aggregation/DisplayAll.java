package aggregation;

public class DisplayAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objstud = new Student();
		objstud.setStudName("Aparna");
		objstud.setRollNo(25);
		
		 Address objaddr = new  Address();
		 objaddr.setHouseName("nila");
		 objaddr.setHouseNo(1002);
		 objaddr.setPlace("vattiyoorkavu");
		 objaddr.setPinNo(695013);
		 objaddr.setStd( objstud );
		 objaddr.display();

	}

}
