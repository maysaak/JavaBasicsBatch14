package ReviewClass2;

public class ifElseDemo {

	public static void main(String[] args) {
		
	
		String userName="Admin";
		String passwrod= "password123";//if remove 123 "Wrong password will be executed
		
		if(passwrod.equals("password123")) {
			System.out.println("Welcome "+ userName);
		}else {
			System.out.println("Wrong password "+userName);
			
			/*
			 * when we have to check if a box contains a value or not 
			 * we can use == or equals.to()
			 * when the data if primitive we use like == like char int short, etc.
			 * when the datatypes are non-primitive like String we use .equals()
			 */
			
		}
		}
	}


