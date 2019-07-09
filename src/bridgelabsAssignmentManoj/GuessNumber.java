package bridgelabsAssignmentManoj;

import java.util.Scanner;

public class GuessNumber {
public static int c;
	public static void main(String[] args) {
	
		int n=Integer.parseInt(args[0]);
		int N=n;
		
	  int c=0;
		while(n!=1&&n>0) {
			if(n%2!=0) {
				System.out.println("Number is not a power of two");
				System.exit(0);
				
			}
			n=n/2;
			c++;
		}
		
		
		BinarySearch(0,N);

	}

	
	public static void BinarySearch(int s,int n)
	{
		int mid;
		if(s==n) {
		System.out.println("U r number is "+s);
		System.exit(0);
		}
			Scanner sc=new Scanner(System.in);
			if((n+s)%2==0)
			mid=(n+s)/2;
			else mid=((n+s)/2)+1;
			System.out.println("Enter 1("+s+","+(mid-1)+") or 2  ("+mid+","+n+")");
			int in=sc.nextInt();
			if(in==1) {
				BinarySearch(s,mid-1);
				
			}
			else {
				
				BinarySearch(mid,n);
				//System.out.println(s+","+n);
}
}

}