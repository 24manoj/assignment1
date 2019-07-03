package bridgelabsAssignmentManoj;
import java.util.*;

public class LeepYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Input  year!!!!");
year=sc.nextInt();

if(Integer.toString(year).length()==4) {
	check(year);
}else
{
	System.out.println("Year should be of 4 digits..!!!!Enter in  proper format.!!");
}

	}
	public static void check(int year) {
		Boolean flag=false;
if(year%4==0) {
	flag=true;
         if(year%100==0) {
        	 flag=false;
         if(year%400==0) 
        	 flag=true;
        	 else
        		 flag=false;
         }else
        	 flag=true;
}
if(flag)
	System.out.println("Year "+year+" is a leep year");
else
	System.out.println("Year "+year+" is not a leep year");	
}
}