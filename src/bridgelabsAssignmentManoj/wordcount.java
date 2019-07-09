package bridgelabsAssignmentManoj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class wordcount {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
		String contents=new String(Files.readAllBytes(Paths.get("C:\\Users\\Manoj\\eclipse-workspace\\assignment1\\src\\output.txt")));
		//System.out.println(" "+contents);
		String[] ch=new String[contents.length()];
		ch=contents.split(" ");
	System.out.println(ch[0]);
		System.out.println("Enter the Substring");
		String str=sc.next();
		
	Arrays.sort(ch);
	int mid=ch.length/2;
	int c=0;
	for(int i=0;i<ch.length;i++) {
		int r=str.compareTo(ch[i]);
		c++;
		if(r<0)
			mid--;
		else if(r>0)
			mid++;
		else if(r==0) {
			System.out.println("String "+str+"  Found @"+(i));
		}
		
		
	}
	if(c==ch.length) {
	
			System.out.println("String "+str+" not Found OR Not Exist");
		
	}
	
	}
	
}

