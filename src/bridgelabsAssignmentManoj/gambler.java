package bridgelabsAssignmentManoj;
import java.util.*;

public class gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Stake Your bet..");
		int stake=sc.nextInt();
		System.out.println("Goal to Reach...");
		int goal=sc.nextInt();
		System.out.println("Number of Trails..");
		int trails=sc.nextInt();
		int wins=0;
		int bet=0;
		for(int i=0;i<trails;i++) {
			int cash=stake;
			while(cash>0 && cash<goal) {
				bet++;
				if(Math.random()<0.5) {
					cash++;
					
				}
				else
					cash--;
				if(cash==goal) {
					wins++;
				}
			}
			
		
		}
		//System.out.println("number bets  "+bet);
		System.out.println(wins+" in  "+trails);
		System.out.println("win percent   "+(float)(100*wins/trails));
		System.out.println("Average bets  "+(float)(1*bet/trails));
		
	}

}
