package ReviewClass5;

public class Array2Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] individualsInRoom1=new String[] {"Maysa", "Alina","Arslan"};
		String[] individualsInRoom2=new String[] {"Rami", "Zlata","Anna", "David"};
		String[] individualsInRoom3=new String[] {"Jeren", "Olivia","Maral"};
		//a 2D array that will store 3 single d arrays
		String[][] rooms=new String[3][];
		
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		
		System.out.println(rooms[1][0]);//output - Rami
		System.out.println(rooms[2][2]);//output-Maral 
		
	}

}
