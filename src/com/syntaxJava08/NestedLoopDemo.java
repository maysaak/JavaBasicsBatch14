package com.syntaxJava08;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
	
		for (int i=3; i<3; i++) {//outer loop controls inner loop
			System.out.println("hello");
			
			for( int j= 1; j<=3; j++) {//inner loop depends on outter loop 
				System.out.println("bye");
			}
		}
		
		System.out.println("End of the code");
		System.out.println("===========================");
		for(int i=0; i<=2; i++) {
			for(int j=1; j<4; j++) {
				System.out.println(i+" "+j);
			}
			
		}
		System.out.println("End of the code");
	}

}
