package com.syntaxJava13;

public class StringDemo3 {

	public static void main(String[] args) {

    String str="kckl3urGBIKJO858909e#$%&*";
    System.out.println(str.replaceAll("[0-9]","!"));//replaced with !!!
    System.out.println(str.replaceAll("[0-7]",""));//removed numbers
    System.out.println(str.replaceAll("[a-z]",""));//removes all lower case letters 
    System.out.println(str.replaceAll("[A-Z]",""));//removes all Upper case letters 
    System.out.println(str.replaceAll("[A-z]",""));//removes all alphabetic letters refer to ascii table
    System.out.println(str.replaceAll("[^A-zA-Z]",""));//remove everything but letters
    System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));//remove everything but letters and numbers 
    //
	}

}
