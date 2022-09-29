package com.syntaxJava07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country= input .nextLine();
        String language=null;

        switch(country) {
        case "India":
            language="Hindi";
            break;

        case "Canada":
            language="French";
            break;

        case "USA":
            language="English";
            break;

        case "Brazil":
            language="Portuguese";
            break;
        default:
            language="Invalid";
            break;

        }
        System.out.println(" your are from " + country + " and your native language is "+ language);

    }


	}

