package ReviewClass5;

public class ArraysDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dresses =new String[] {"Coctail", "Summer Dress", "Night Dress", "Pencil Dress"};
		
		System.out.println(dresses.length);
		
		for(int i=0; i<dresses.length; i++) {
			System.out.println("Lets try " +dresses[i]);
		}
       //enchance for loop
		for(String dress:dresses) {
			System.out.println(dress);
		}
		System.out.println("********************************");
	}

}
