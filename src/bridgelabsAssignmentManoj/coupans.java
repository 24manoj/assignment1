package bridgelabsAssignmentManoj;
import java.util.*;

public class coupans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number of  Distic Coupan ");
int n=sc.nextInt();
if(n==0) {
	System.out.println("Enter proper value!!!!");
	
}
disct(n);

	}

	public static void disct(int n) {
		
		Random r=new Random();
		int gen;
		int count=0;
		List a=new ArrayList();
		for(int i=0;i<n+count;i++) {
			gen=r.nextInt(n);
			if(a.isEmpty()) {
				a.add(gen);
			}else 
				{
				if(a.contains(gen)) {
					count++;
					continue;}
				else
					a.add(gen);
				
			}
		}
		System.out.println(a);
}}
