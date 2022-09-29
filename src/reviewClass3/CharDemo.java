package reviewClass3;

public class CharDemo {

	public static void main(String[] args) {
		
		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework =false;
		
		
		if(programmer &&manualTester) {
	System.out.println("You can be an automation enginee");
	}else {
		System.out.println("You must know a programming language and manual testing" + "to be an automation engineer");
	}

}
}