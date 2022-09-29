package reviewClass3;

import java.util.Scanner;

public class YesNoExample {

	public static void main(String[] args) {
		
		Scanner key=new Scanner(System.in);
		System.out.println("Are your from batch 14");
		String batch14=key.next();
		
		if(batch14.equalsIgnoreCase("yes")) {
			System.out.println("You are amzing");
		}else {
			System.out.println("You are good");
		}
		
		

	}

}
