package bridgelabsAssignmentManoj;

import java.util.*;

class cross{
	static int [][] bord=new int [3][3];
	static int count=0;
	//int h=0;
	
	
	
public  void initial() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bord[i][j]=0;
			}
		}
	}
	
	
public static void insert(int  index1, int index2,int element) {
	int res;
	
if(bord[index1][index2]==0 ) {
	
	bord[index1][index2]=element;
	count++;
	res=check(element);
	if(res==element) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(bord[i][j]+" ");
				
			}
			System.out.println("\n");
		}
		System.out.println("Player "+element+"  wins");
		System.exit(0);
	}//end if
	if(count==9 && res==3) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(bord[i][j]+" ");
				
			}
			System.out.println("\n");
		}
		System.out.println("U have ..Meet with Tie!!!!!!");
		System.exit(0);
		
	}
}
else
{
	System.out.println("SRY>>SLOT FILLED >>>>ReStart the game0");
	CrossGame.c--;
	System.exit(0);
	//CrossGame.h=true;
	//CrossGame.ele=element;

}

	
}

public static void system() { 
	Random r=new Random();
	int index1,index2;
	index1=r.nextInt(3);
	index2=r.nextInt(3);
	if(bord[index1][index2]!=0) {
		system();
	}
	System.out.println("System used slot"+index1+" "+index2+" ");

	insert(index1, index2, 2);

}

public static int check(int element) {
	for(int i=0;i<3;i++){
	
		if(bord[i][0]== element &&bord[i][1]==element&&bord[i][2]==element )
			return element;
		if(bord[0][i]== element &&bord[1][i]==element&&bord[2][i]==element)
			return element;
	}
	if(bord[0][0]==element&&bord[1][1]==element&&bord[2][2]==element)
	return element;
	if(bord[0][2]== element&&bord[1][1]==element && bord[2][0]==element)
	return element;
	return 3;
	
}
}
public class CrossGame {
 
	public static int c,ele=0;
	public static boolean h=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int index1,index2;
		cross cr=new cross();
		cr.initial();
	
		while(c<9) {
			
			System.out.println("Enter palyer 1[0-2][0-2]");
			index1=sc.nextInt();
			index2=sc.nextInt();
			c++;
			cr.insert(index1, index2, 1);
			
			if(c<8) {
				
				//System.out.println("Enter palyer b[0-2][0-2]");
				cr.system();
							}
			
		}if(c==9) {
			System.out.println("Out of Moves...bye");
		}
	

	}


	
}
