package bridgelabsAssignmentManoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		int n;
		System.out.println("Enter N number");
		n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		
		}
		sort(0,n-1,arr);
		Print(arr);
	
		

	}
	public static void sort(int s,int n,int [] arr) {
			
		int mid;
		if(s<n) {
			
			mid=s+(n-s)/2;
			
			sort(s,mid,arr);
			//Print(arr);
			sort(mid+1,n,arr);
			//Print(arr);
			
			merge(arr,s,mid,n);
		}
	}
		public static void merge(int [] arr,int s,int mid,int n) {
			int n1,n2;
			n1=mid-s+1;
			n2=n-mid;
			int l[]=new int[n1];
			int r[]=new int[n2];
			
			for(int i=0;i<n1;i++)
			{
				l[i]=arr[s+i];
			}
			for(int j=0;j<n2;j++) {
			//System.out.println(j);
				r[j]=arr[mid+1+j];
			}
			int i=0,j=0;
			int k=s;
			
			while(i<n1 && j<n2) {
				if(l[i]<=r[j]) {
					arr[k]=l[i];
					i++;
					
				}else
				{
					arr[k]=r[j];
					j++;
				}
			k++;
			
			}
			
			while(i<n1) {
				arr[k]=l[i];
				i++;
				k++;
			}
			while(j<n2) {
				arr[k]=r[j];
				j++;
				k++;
			}
		}
		public static void Print(int []arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\n");
		}
	}




