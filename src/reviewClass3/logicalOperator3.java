package reviewClass3;

public class logicalOperator3 {

	public static void main(String[] args) {
		
		double savings=200000;
		boolean freeTime=true;
		String season="Summer";
		
		if(savings>10000 && freeTime&&season.equals("Summer")) {
			System.out.println("Lets go to Bora Bora");
		}else {
			System.out.println("Need to make some money");
		}
	}

}
