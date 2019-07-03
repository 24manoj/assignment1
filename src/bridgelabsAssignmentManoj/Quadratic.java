package bridgelabsAssignmentManoj;
import java.util.*;
import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A,B and C value");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double delta = (b*b) - 4*a*c;
		//System.out.println(delta);
		if(delta>0) {
		double x1=  ( (-b + Math.sqrt(delta))/(2*a));
		double x2=  ((-b - Math.sqrt(delta))/(2*a));
		System.out.println("Root 1 value  "+x1);
		System.out.println("Root 2 value  "+x2);
		
		}
		else if(delta==0) {
			double x1=  ( -b /(2*a));
			System.out.println("Root is value  "+x1);
		}
		else
		{
			System.out.println("Equation has no real root");
		}
		
	}

}
