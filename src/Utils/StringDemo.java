package Utils;

public class StringDemo {

	public static void main(String[] args) {
		
		String str=new String("Java");
		String name="Java";//only works for String and Wrapper classes 
		
		System.out.println(str.length());
		System.out.println(str.length());
		if(name.length()<15) {
			System.out.println("Name cant be more than 15 characters");
		}
	}

}
