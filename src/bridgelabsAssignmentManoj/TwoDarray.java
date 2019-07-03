package bridgelabsAssignmentManoj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDarray {
public static void main(String args[]) throws Exception {
	int n,m;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  number Rom and Column ");
	//OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("output.txt"));

	n=sc.nextInt();
	m=sc.nextInt();
	int a[][]=new int[n][m];
	System.out.println("Enter input to array ");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
			//out.write(a[i][j]);
			
		}
	}
	PrintWriter pw=new PrintWriter(System.out,true);
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
	pw.print(a[i][j]+"\t");
		}
	pw.println();
	}
}

}
