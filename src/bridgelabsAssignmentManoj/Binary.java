package bridgelabsAssignmentManoj;
import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number to know DecimalValue");
int n=sc.nextInt();
toBinary(n);

	}
	public static void toBinary(int n)
	{
	
	int b1=(n & 0x0F)<<4;
	
	int b2=n>>4;
	int y=(b1 | b2);
	
	System.out.println("The Decimal value of "+n+ "  is  "+y);
	
	}

}
