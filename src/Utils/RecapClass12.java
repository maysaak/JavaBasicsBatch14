package Utils;

import java.util.Arrays;

public class RecapClass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Today is Sunday";
		String str2=new String("Today is Sunday");
		String day=str.substring(9);
		System.out.println(day);
  System.out.println(str.substring(6,8));
System.out.println(str.substring(0,5));
char c=str.charAt(4);
System.out.println(str.charAt(4));

char[] charArr=str.toCharArray();
System.out.println(charArr);
System.out.println(Arrays.toString(charArr));
int index=str.indexOf("a");
System.out.println(index);
System.out.println(str.indexOf("a",6));
	}

}
