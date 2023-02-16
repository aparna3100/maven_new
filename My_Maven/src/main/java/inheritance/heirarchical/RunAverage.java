package inheritance.heirarchical;

public class RunAverage extends Cricket{

		float average;
	    public void findAvgOfRun() {
	    	
			
	    	player(436,18426,"Sachin Tendulkar");     
	        average= totalRun/matchPlayed;
	        System.out.println("average run is : "+average);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunAverage obj = new RunAverage();
		obj.findAvgOfRun();
		
	}

}
