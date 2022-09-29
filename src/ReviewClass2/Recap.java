package ReviewClass2;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Manual/Narrowing/Explicit
		//We cant fit 129 in byte we will get wrong results	
short largerBox=129;
byte smalerBox =(byte)largerBox;
System.out.println(smalerBox);

//Manual/Narrowing/Explicit
		//As We can fit 129 in short we will get right results	
int largerBox1=129;
short smallerBox2=(short)largerBox1;
System.out.println(smallerBox2);

//Manual/Narrowing/Explicit
short smallerbox3=45;
long largerbox3=smallerbox3;
System.out.println(smallerbox3);

}

}
