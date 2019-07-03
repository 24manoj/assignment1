package bridgelabsAssignmentManoj;
import java.util.*;
public class stringTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name;
String str="Hello <<UserName>>,How are you?";
System.out.println("Enter User name");
if((name=sc.next()).length()<3)
{
	System.out.println("Name should >3 characters...");
   
}
else
{
str=str.replace("<<UserName>>",name);
System.out.println(str);
	}}

}