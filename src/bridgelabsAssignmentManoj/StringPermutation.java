package bridgelabsAssignmentManoj;

import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		permuteString("",str);
		
	}
	public static void permuteString(String perm,String input) {
		
		if(input.length()==0) {
			System.out.println(perm);
		}
		else {
			for(int i=0;i<input.length();i++)
			{
			//System.out.println(perm);
				permuteString(perm+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
			}
		}
	}

}
