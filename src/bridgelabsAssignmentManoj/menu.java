package bridgelabsAssignmentManoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class menu {
	static Scanner  sc=new Scanner(System.in);
	static double  elp1;
	static double elp2;
	static  double elp3;
	static double elp4;
	static double elp5;
	static double elp6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(;;) {
		System.out.println("Select U R Choice");
		System.out.println("\n1.Binary Search Integer\n2.BinarySearch String\n3.Insertion sort Integer\n4.Insertion sort String\n5.Bubble sort Integer\n6.Bubble sort String\n7.Elpased Time");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			NumberBinary();
			System.out.println("Elpase time"+elp1);
			break;
		case 2:
			StirngBinary();
			System.out.println("Elpase time"+elp2);
			break;
		case 3:
			IntegerInsertionsort();
			System.out.println("Elpase time"+elp3);
			break;
		case 4:
			StringInsertionSort();
			System.out.println("Elpase time"+elp4);
			break;
		case 5:
			IntegerBubbleSort();
			System.out.println("Elpase time"+elp5);
			break;
		case 6:
			StringBubbleSort();
			System.out.println("Elpase time"+elp6);
			break;
		default:
			if(elp1!=0&&elp2!=0&&elp3!=0&&elp4!=0&&elp5!=0&&elp6!=0) {
			double []times= {elp1,elp2,elp3,elp4,elp5,elp6};
			Arrays.sort(times);
			System.out.println("Sorted Times are ");
			for(int i=times.length-1;i>=0;i++) {
				System.out.print(times[i]+" ");
			}
			}else
			{
				System.out.println("Perform all the operation first");
				break;
			}
		}

}
	}
public static void NumberBinary()
{ double start=System.nanoTime();
	int search,n;
	Scanner in=new Scanner(System.in);
	List<Integer> arr=new ArrayList<Integer>();
	System.out.println("Enter N Number of elements");
	n=in.nextInt();
	System.out.println("Elements in Ascending order");
	for(int i=0;i<n;i++) {
		arr.add(in.nextInt());
		
	}
	System.out.println("Key to Serach");
	search=in.nextInt();
	

	int mid=(arr.size()/2);
	while(true)
	{
		if(mid>0) {
	if(search<arr.get(mid)) mid--;
	else if(search>arr.get(mid)) mid++;
	else  {
		System.out.println("Elemnet "+search+" Found at "+(arr.indexOf(search)+1)+" Position \n");
	break;
	}
		}
	else {
		System.out.println("Elemnet "+search+" not Found ");
	break;
	}
	}
	elp1=System.nanoTime()-start;
	}//end of intbinary


public static  void StirngBinary() {
	double start=System.nanoTime();
	System.out.println("Enter size of String");
int n=sc.nextInt();
String ch;
char []a=new char[n];
System.out.println("String in ASCII order");
	
	ch=sc.next();
	a=ch.toCharArray();
	if(ch.length()>n) {
		System.out.println("OverLoaded");
		System.exit(0);
}
	System.out.println("Enter Character to search");
	String sub=sc.next();
	if(sub.length()>1) {
		System.out.println("OverLoaded");
		System.exit(0);
	}
	char a1[]=new char[1];
	a1=sub.toCharArray();
	int mid=(a.length/2);
	
	
	for(int i=0;i<a.length;i++) {
		if(mid<0 && mid>a.length)
		{	System.out.println("Character "+a1[0]+"not found");}
		else
		{
			//System.out.println(mid);
			//System.out.println((int)a1[0]+","+(int)a[i]);
		if((int)a1[0]<(int)a[mid]) {
			
			mid--;
			
		}
		else if((int)a1[0]>(int)a[mid]) {
			mid++;
		}else
		{
			System.out.println("Chracter  "+a1[0]+"  found at "+(mid+1)+"\n");
			break;
		}
	}		
		}
	elp2=System.nanoTime()-start;
	}//end of String binary
		public static void IntegerInsertionsort() {
			
			double start=System.nanoTime();
	List <Integer> arr=new ArrayList<Integer>();
	
	System.out.println("Enter Nth Number");
	int n=sc.nextInt();
	System.out.println("Elements one by one");
	for(int i=0;i<n;i++) {
		arr.add(sc.nextInt());
	}
	int j,key;
	for(int i=1;i<n;i++) {
		j=i-1;
		//System.out.println(j);
		key=arr.get(i);
		while( j>=0 && arr.get(j)>key) {
			arr.set(j+1, arr.get(j));
			j-=1;
		}
		
	
		arr.set(j+1, key);
		
	}System.out.println("Sorted elements are");
		System.out.println(arr);
		elp3=System.nanoTime()-start;
		}//end of 
		
public static void StringInsertionSort()
{
	double start=System.nanoTime();
System.out.println("Enter size of String");
	int n=sc.nextInt();
	String ch;
	char []a=new char[n];
	System.out.println("String");
		
		ch=sc.next();
		a=ch.toCharArray();
		if(ch.length()>n) {
			System.out.println("OverLoaded");
			System.exit(0);
	}int j;
	int key;
	for(int i=1;i<n;i++) {
	j=i-1;
	key=(int)a[i];
	while(j>=0&&(int)a[j]>key) {
		a[j+1]=a[j];
		j-=1;
	}
	a[j+1]=(char)key;
	}
		
	for(int i =0;i<n;i++) {
		System.out.print(a[i]+" ");
		
	}
	System.out.println("\n");
	elp4=System.nanoTime()-start;
	
}//end of String Insertionsort

public static void IntegerBubbleSort()
{
double start=System.nanoTime();
List <Integer> arr=new ArrayList<Integer>();
	
	System.out.println("Enter Nth Number");
	int n=sc.nextInt();
	if(n==0) {
		System.out.println("Sort not possible");
	}
	System.out.println("Elements one by one");
	for(int i=0;i<n;i++) {
		arr.add(sc.nextInt());
	}
for(int i=0;i<n;i++) {
	for(int j=0;j<n-1-i;j++) {
		if(arr.get(j)>arr.get(j+1))
		{
			int temp=arr.get(j);
			arr.set(j, arr.get(j+1));
			arr.set(j+1, temp);
		}
		
	}
//System.out.println(arr);
		
	}System.out.println("Sorted elements are");
		System.out.println(arr);
		elp5=System.nanoTime()-start;
		
		}//end of Int bubble

public static void StringBubbleSort() {
	double start=System.nanoTime();
System.out.println("Enter size of String");
int n=sc.nextInt();
String ch;
char []a=new char[n];
System.out.println("String");
	
	ch=sc.next();
	a=ch.toCharArray();
	if(ch.length()>n) {
		System.out.println("OverLoaded");
		System.exit(0);
}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i-1;j++) {
			if(a[j]>a[j+1]) {
				char temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("\n");
elp6=System.nanoTime()-start;
}

}

	



