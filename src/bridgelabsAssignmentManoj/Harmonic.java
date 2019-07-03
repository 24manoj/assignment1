package bridgelabsAssignmentManoj;
import java.util.*;
public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enthe Nth Harmonic number");
int n=sc.nextInt();
if(n!=0) {
float sum=0;


System.out.println("Harmonic series are:::");
for(int i=1;i<=n;i++) {
	
	System.out.println("1/"+i+"--->"+((float)1/(float)i));
	sum=sum+(((float)1/(float)i));
	
}
System.out.println("\nThe sum of Harmonic series "+sum);

	}
	else
    System.out.println("N should be > then 0");

}}
