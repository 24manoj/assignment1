package bridgelabsAssignmentManoj;
import java.util.*;
public class Vending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount in Rupees");
		amt=sc.nextInt();
		vend(amt);
		
		
		
		
	}

	public static void vend(int amt) {
		int [] ven= {1000,500,100,50,10,5,2,1};
		int []notes=new int[ven.length];
		int count=0;
for(int i=0;i<ven.length;i++) {
		if((amt/ven[i])>0) {
			notes[i]=amt/ven[i];
			amt=amt%ven[i];
			
			
			
		}}
		for(int j=0;j<ven.length;j++) {
			//System.out.println(ven[i]);
			if(notes[j]>0) {
			System.out.println(ven[j]+" * "+notes[j]+" ="+(ven[j]*notes[j]));
			 count = count+notes[j];
			
		}
	}
			
		
		
		
		
	
}}