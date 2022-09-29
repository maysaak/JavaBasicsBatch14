package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/*
		 * type casting => converting one data type to another data type
		 * converting one data type to another
		 * to covert the data we need to use ()
		 * 2 types of conversion - smaller to lager as well larger to smaller box
		 */
		 byte box1 = 127; //smallest box 8 bits
		 short box2 = 3333; //double the size of box1 in terms of bits = 16 bits
		 int box3 = 45454545; // large box most commonly used 
		 long box4= 454545454; //slightly large box
		 float box5= 4513545; //larger box
		 double box6 =44448441; //largest box
		 
		 
         int number =(int)15.2; //we cant store decimal number in a box of type int 
         System.out.println(number);
         
         long smallerBox= (long)box2; //in () we need to what type of data we want to convert the data to 
         System.out.println(smallerBox);
         
         short biggerBox =box1;
         
         //whitening - smaller data type to larger data type (does not result any issues)
         
         long box7= box1;//we can do this box7 is larger than box1
         
         //float box8=box6 = will not be able to do because double type is larger than float type 
         //however if i try to do it this is the way>>
         
         float box8=(float)box6; //forcing to fit larger into smaller 
         
         char a=(char)67;
         System.out.println(a);
         
         //refer to the ascii table 
         
         int box9=(int)box4;
         System.out.println(box9);
         
	}

}
