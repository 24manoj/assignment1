package bridgelabsAssignmentManoj;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class PrimeAnagramPalindrom {

	public static void main(String[] args) {

	
	boolean result;
	int res;
				List size=checkPrime();
				
		Integer[] arr=new Integer[size.size()];
		for(int i=0;i<arr.length;i++) {
			arr[i]= (int) size.get(i);
			if(arr[i]>10)
			palindrom(arr[i],arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= (int) size.get(i);
	//		System.out.println(arr[i]);

			
	//	anagram(arr[i]);
			
						
		}
			Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>10)
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==(res=anagram(arr[j]))&&arr[i]==res) {
					System.out.println(arr[i]+" and "+arr[j]+" are anagram");
					
				}
				
			}
		}
		
			
				
	}
	
	public static void palindrom(int n,int n1) {
	
		int rem,rev=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(n1==rev)
		{
			System.out.println(n1+" is Palindrom");
		}
	}

	
			public static List checkPrime() {
				List pm=new ArrayList();
			    
				for(int i=2;i<1000;i++) {
					int flag=0;
					for(int j=2;j<i;j++) {
						if(i%j==0)flag=1;
					
					
				}
					if(flag==0)
					{
						pm.add(i);
						}
					
					}
				
				System.out.println(pm);
			
			
				return (pm);
				
				
							
				}
			
			
			public static int anagram(Integer arr) {
			/*	for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
					List <Integer> w=new ArrayList<Integer>();	
				String st1=Integer.toString(arr[i]);
				String st2=Integer.toString(arr[j]);
				
				if(st1.length()==st2.length()) {
				
				char[] ch1=st1.toCharArray();
				
				char[] ch2=st2.toCharArray();
				
						Arrays.sort(ch1);
						Arrays.sort(ch2);
					
						if(Arrays.equals(ch1,ch2)) {
							if(w.contains(arr[i])&&w.contains(arr[j]));
							else {
								
								w.add(arr[i]);
								System.out.println(arr[i]+","+arr[j]+" is annagram");
							}
						
						}
					}
				}
				
				}*/
				int rem,rev=0;
				while(arr!=0)
				{
					rem=arr%10;
					rev=rev*10+rem;
					arr=arr/10;
				}
				return rev;
			}
			
			
			
			
				}
				
			
				
			


		


	
