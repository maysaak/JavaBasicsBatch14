package reviewClass3;

public class NestedVsLogicalOperator {

	public static void main(String[] args) {

		boolean programmer=true;
		boolean manualTester=true;
		boolean knowFramework =false;
		
		if(programmer) {
			if(manualTester) {
			}else {
				System.out.println("You can be an automation enginee");	
			}
		}
	}

}
