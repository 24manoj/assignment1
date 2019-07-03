package bridgelabsAssignmentManoj;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t = 0,h = 0;
		float g;
		System.out.println("Number of Flips");
		int n=in.nextInt();
		
		for(int i=0;i<n;i++) {
			Random r=new Random();
			g=r.nextFloat()*(1-0)+0;
			System.out.println(g);
			if(g<0.5) 
				t+=1;
			else
				h+=1;
			
			
		}
		float tails=t;
		float heads=h;
		
		
		System.out.println("Tails  in "+n+" flips<<"+t);
		System.out.println("Heads  in "+n+" flips<<"+h);
		System.out.println("head vs tails percent "+(int)((heads/n)*100)+" VS  "+(int)((tails/n)*100));
	}

}
