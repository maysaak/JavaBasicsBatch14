package ReviewClass5;
import java.util.Arrays;

public class Array2DDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int [][] {
			{10,20,30},
			{25,25,63},
		
		};
		
		System.out.println(Arrays.toString(arr[1])); //output will be [25, 25, 63]

		System.out.println(arr[1][2]);//output will be 63 
		int smallest=arr [0][0];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(arr[i][j]<smallest) {
					smallest=arr [i][j];
					}
			}
			System.out.println(smallest);
		}
	}

}
