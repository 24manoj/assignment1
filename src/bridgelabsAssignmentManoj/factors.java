package bridgelabsAssignmentManoj;
import java.util.*;
public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Nth number ");
		int n=sc.nextInt();
	primefactors(n);
	
	}
	public static void primefactors(int n) {

		
	for(int i=2;i*i<=n*n;i++) {
		while(n%i==0) {
			
			System.out.print(i+" " );
			n/=i;
		}
	}

	}
}