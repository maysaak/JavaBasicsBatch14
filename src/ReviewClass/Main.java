package ReviewClass;

public class Main {

	public static void main(String[] args) {
		
		/* 
		 * if we want to store whole number we can use below data types numbers without dicimal parts like 10, 23, 4000
		 * etc but we cant use them to store decimal numbers like 12.3, 1.5 etc 
		 * byte 
		 * short
		 * int
		 * long
		 * although above four data types can be used to store whole numbers but we will be suing int most of the 
		 * time as it can handle up to billions and does not was a lot of space from RAM (Memory where computer stores the program
		 * which are opened and running currently)
		 */
		
		int box1 =12; 
		//int => date type 
		//box1 => variable name 
		//= is called assignment operator and used to store data in variable 
		//its the data that we want to store in box1
		
		int box2; //creating a box but not storing data right away in the box
		box2=20;
		
		box1=30;//i am replacing the value 12 stored in box1 with 30
		
		 System.out.println(box1);
		

	}

}
