package inheritance.heirarchical;

public class HalfCenturies extends Cricket {
	float fifties;
	public void findNoOfHalfCenturies() {
    	
		
		player(436,18426,"Sachin Tendulkar");
        fifties = totalRun/50;
        System.out.println("total number of half centuries : "+fifties);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HalfCenturies  obj = new HalfCenturies ();
		obj.findNoOfHalfCenturies() ;
	}

}
