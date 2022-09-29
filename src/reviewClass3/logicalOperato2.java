package reviewClass3;

public class logicalOperato2 {

	public static void main(String[] args) {
		
		boolean isHungry=false;
		boolean iceCream=true;
		boolean fruit =true;
		boolean tacoTruck=false;
		
		if(iceCream|fruit|tacoTruck) { //| stands for Or 
			System.out.println("I am good for midnight scnack");
		}else {
			System.out.println("Need to buy some scnacks");
		}
		
	}

}
