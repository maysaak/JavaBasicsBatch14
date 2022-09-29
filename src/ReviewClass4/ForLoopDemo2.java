package ReviewClass4;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		// i want to print this pattern 10 8 6 4 2 0 
		for(int i=10; i>=0; i=i-2) {
			System.out.println(i);
		}
		System.out.println("                 ");
        System.out.println(" ____________   ");
        
        //9 5 1 
        
        for(int i=9; i>=1; i-=4) {
        System.out.println(i);
        }
        
	}

}
