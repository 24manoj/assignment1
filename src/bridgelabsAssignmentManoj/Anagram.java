package bridgelabsAssignmentManoj;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {
public static String s1;
public static String s2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter String1");
		str1=sc.next();
		
		
		System.out.println("Enter String1");
		str2=sc.next();
		
		char st1[]=str1.toCharArray();
		char st2[]=str2.toCharArray();
			Arrays.sort(st1);
			Arrays.sort(st2);
			checkAnagram(st1,st2);
	}

	public static void checkAnagram(char[] st1,char[] st2) {
		boolean result=false;
	
		if(st1.length==st2.length) {
			
			
				if(Arrays.equals(st1,st2)) {
					result=true;
					
					
				}
				else
					result=false;
			}
			
		
		if(result) {
			System.out.println("String   is Annagram");
		}else
		{
			System.out.println("String  is not  Annagram");
		}
		
	}
}
