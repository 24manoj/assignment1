package bridgelabsAssignmentManoj;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPrime();
		

	}
	public static void checkPrime() {
		List<Integer> pm=new ArrayList<Integer>();
	
		for(int i=2;i<1000;i++) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)flag=1;
			
			
		}
			if(flag==0)
			{
				pm.add(i);
				}
			
			}
		System.out.println(pm);
	}

}
