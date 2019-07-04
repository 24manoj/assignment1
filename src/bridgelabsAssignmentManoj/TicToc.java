package bridgelabsAssignmentManoj;
import java.util.*;
public class TicToc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game g=new game();
		g.createdashboard();
		g.play();
		

	}}
	class game{
		
		public static int a[][]=new int[3][3];
public void createdashboard()
{ 
	

	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=0;
			
			
		}
	}
}
	public  void play()
	{
		Scanner sc=new Scanner(System.in);
		int p1ind1 = 0,p1ind2 = 0,p2ind1 = 0,p2ind2 = 0;
		int count=0;
		int res=0;
		//boolean playerA = false,playerB = false;
		//System.out.println("a length"+a.length);
	while(count<9)
	{
			
				System.out.println("Player A enter index value[0-2][0-2]");
				p1ind1=sc.nextInt();
				p1ind2=sc.nextInt();
			count++;
if(a[p1ind1][p1ind2]==0) 
{
a[p1ind1][p1ind2]=1;
System.out.println("inserted a");
res=result();
//for(int i=0;i<3;i++) {
	//for(int j=0;j<3;j++) {
	//	System.out.print(a[i][j]+" ");
	//}
	//System.out.println("\n");}
//}}}}
//System.out.println(res+"a");
       if(res==1)
       {
	//System.out.println("PlayerA wins");
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println("\n");}
	System.out.println("PlayerA wins");
System.exit(0);
}

else if(count==9 && res==3) {
System.out.println("Tie");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println("\n");}
System.out.println("Tie");
}
}
else
System.out.println("U  cant insert there....?????");
		//System.out.println("a "+count);
			if(count<9 && res!=2)
			{
				System.out.println("Player B enter index value[0-2][0-2]");
				p2ind1=sc.nextInt();
				p2ind2=sc.nextInt();
				count++;
				if(a[p2ind1][p2ind2]==0) {
					a[p1ind1][p1ind2]=2;
					System.out.println("inserted b");
				res=result();
				//System.out.println(res);
				
				
				if(res==2)
				{
				
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println("\n");}
				System.out.println("PlayerB wins");
				System.exit(0);
				}
				if(count==9 && res==3) {
				System.out.println("Tie");
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						System.out.print(a[i][j]+" ");
					}
					System.out.println("\n");}
				}
				}
				
					else {
					System.out.println("U  cant insert there....?????");
				System.exit(0);}
				//System.out.println("b "+count);
			}
				
	
	}}
	
	
	int result() {
		//char p1 = 0,p2=0,na=0;
		if(a[0][0]==1 && a[1][0]==1 && a[2][0]==1 || a[0][1]==1 && a[1][1]==1 && a[2][1]==1 || a[0][2]== 1 &&a[1][2]== 1 && a[2][2]==1 ||a[0][0]== 1 && a[1][1]== 1&& a[2][2]==1 || a[0][0]== 1 &&a[1][0]==1 && a[2][0]==1 || a[0][2]== 1 && a[1][1]== 1&& a[2][0]==1) {	
			
			return 1;
			
					}
		else if(a[0][0]==2 && a[1][0]==2 && a[2][0]==2 || a[0][1]==2 && a[1][1]==2 && a[2][1]==2 || a[0][2]== 2 &&a[1][2]== 2 && a[2][2]==2 ||a[0][0]==2 && a[1][1]== 2&& a[2][2]==2 || a[0][0]== 2 &&a[1][0]==2 && a[2][0]==2 || a[0][2]== 2 && a[1][1]== 2&& a[2][0]==2) {	
						
					return 2;
		}
				return 3;
	}
	}
	
	
	