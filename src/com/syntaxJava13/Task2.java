package com.syntaxJava13;

public class Task2 {

	public static void main(String[] args) {
		// create a string and print in it reverse order (Sunday->yadnus)
		
		String str="Sunday";
		for(int i=str.length()-1; i>=0;i--) {
		System.out.print(str.charAt(i));
		

	}
		System.out.println();
System.out.println("======================");
//second way
char[] charArr=str.toCharArray();
for(int i=charArr.length-1; i>=0; i--) {
	System.out.print(charArr[i]);
}

}
}