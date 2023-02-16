package inheritance.heirarchical;

public class Centuries extends Cricket{
	
		float hundreds;
	    public void findNoOfCenturies() {
	    	
			
			player(436,18426,"Sachin Tendulkar");
	        hundreds = totalRun/100;
	        System.out.println("total number of centuries : "+hundreds);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 		Centuries  obj = new Centuries ();
		obj.findNoOfCenturies() ;
	}

}
