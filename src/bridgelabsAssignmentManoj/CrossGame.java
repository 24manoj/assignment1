package bridgelabsAssignmentManoj;

import java.util.*;

class cross{
	static char [][] bord=new char [3][3];
	static int count=0;

	
	
	
public  void initial() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				bord[i][j]='!';
			}
		}
	}
	
	
public static void insert(int  index1, int index2,char element) {
	int res;
	
if(bord[index1][index2]=='!') {
	
	bord[index1][index2]=element;
	count++;
	res=check(element);
	if(res==element) {
		print();
		System.out.println("Player "+element+"  wins");
		System.exit(0);
	}//end if
	if(count==9 && res==3) {
		print();
		System.out.println("U have ..Meet with Tie!!!!!!");
		System.exit(0);
		
	}
}
else
{
	print();
	System.out.println("SRY>>SLOT FILLED >>>>ReStart the game0");
	CrossGame.c--;
	System.exit(0);
}

}


public static void print() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(bord[i][j]+" ");
		}
		System.out.print("\n");
	}
}
public static void system() { 
	Random r=new Random();
	int index1,index2;
	index1=r.nextInt(3);
	index2=r.nextInt(3);
if(bord[index1][index2]!='!') {
		system();
	}
	insert(index1, index2,'o');
print();

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
			cr.insert(index1, index2,'x');
			
			if(c<8) {
				
				
				cr.system();
							}
			
		}if(c==9) {
			System.out.println("Out of Moves...bye");
		}
	

	}


	
}
