package com.syntaxJava6;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.println("what time is it?(Please use 24 hour format)");
        double time = scan.nextDouble();

        if (time > 1 && time < 11) {
            System.out.println("Morning");
        } else if (time > 12 && time < 15) {
            System.out.println("Morning");
        } else if (time > 16 && time < 20) {
            System.out.println("Afternoon");
        } else if (time > 21 && time < 24) {
            System.out.println("Night");
        }
	}

}
