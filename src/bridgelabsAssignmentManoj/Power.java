package bridgelabsAssignmentManoj;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=Integer.parseInt(args[0]);
	if(n<0||n>=31) {
		System.out.println("Power out of range..");
		
	}
	else
	{
		for(int i=0;i<=n;i++) {
			System.out.println("2Pow("+i+")-------->"+Math.pow(2,i));
		}
	}
		

	}

}
