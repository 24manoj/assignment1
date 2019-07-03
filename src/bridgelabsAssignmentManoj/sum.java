package bridgelabsAssignmentManoj;
import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N Numbers");
		int n=sc.nextInt();
		List a=new ArrayList();
		int sum=0;
		if(n<3) {
			System.out.println("N CANT BE LESSER THEN ??!!!!");
		}
		else {
		System.out.println("Enter array for N");
		for(int i=0;i<n;i++) {
			int val=sc.nextInt();
			if(a.contains(val)) {
				
				System.out.println("Sry..value should be Distinct....??!!?!!!!!");
			break;
				}else {
					a.add(val);
				}
							
			}
	if(a.size()>3) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
				sum= ((int)a.get(i)+(int)a.get(j)+(int)a.get(k));
				if(sum==0)
				{System.out.println("["+a.get(i)+","+a.get(j)+","+a.get(k)+"]="+sum);
					break;
				}
				}
			}
		}

	}

}}}
