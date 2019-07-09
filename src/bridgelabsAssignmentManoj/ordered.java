package bridgelabsAssignmentManoj;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;


class list{
	static Node head;
public static list add(list list,String data) {
	
	Node newnode=new Node(data);
	newnode.next=null;
	if(list.head==null)
	{
		list.head=newnode;
			}else
	{
		Node cur=list.head;
		while(cur.next!=null)
		{
			cur=cur.next;
			
		}
		
		cur.next=newnode;
		System.out.println("  added"+data);
	}
	list=list.sortList(list);
	return list;
	

}//end of add



public static list remove(list list,String item) {
	Node cur=list.head;
	if( list.head==null){
		System.out.println("UnderFlow");
	}
	else if(list.head.data.equals(item)) {
		list.head=cur.next;
		System.out.println(item+"Found and deleted");
		list=list.sortList(list);
	}
	
	else{
		Node prev = null;
		cur=list.head;
		while(! (cur.data).equals(item)) {
			prev=cur;
			if(cur.next==null)break;
			cur=cur.next;
		}
		
		if(cur==null) {
			System.out.println(item+" not found");
		}
		if(cur!=null) {
		prev.next=cur.next;
		System.out.println(cur.data+ "found and deleted");

		}
		}
	list=list.sortList(list);
	return list;
	


}






public static list search (list list,String item) {
	Node cur=list.head;
	if(list.head==null)
		System.out.println("List is Empty");
	else if(list.head.data==item){
		System.out.println(cur.data+" Found at 0");

	}
	else
	{
		Node prev = null;
		cur=list.head;
		int flag=0;
		while(cur!=null) {
			prev=cur;
			if((cur.data).equals(item )) flag=1;
			cur=cur.next;
		}
		if(flag==1)
			{System.out.println(item+"Key found ");
		list=list.remove(list, item);
		}
		else 
			{System.out.println(item+" Key not found ");
		list=list.add(list, item);
		
	}
	}
return list;
	}





public static boolean isEmpty(list list)
{
	if(list.head==null) {
		return true;
	}
	return false;
}
public  static int getCount(list list) 
{ 
    Node temp = list.head; 
    int count = 0; 
    while (temp != null) 
    { 
        count++; 
        temp = temp.next; 
    } 
    return count; 
} 













public static String print(list list) {
Node cur=list.head;
int i=0;
String [] str=new String[list.getCount(list)];

while(cur!=null) {
System.out.println(cur.data+" ");
str[i]=(String) cur.data;

i=i+1;
cur=cur.next;

}

String str3=Arrays.toString(str);

return str3;
}





public static list sortList(list list)
{
	Node cur=list.head;
	if(list.head==null)
		return list;
	else {
		Node index = null;
		while(cur!=null)
		{
			index=cur.next;
			while(index!=null) {
				
			if(Integer.parseInt((String) cur.data)>Integer.parseInt((String) index.data)) {
				String temp=(String)cur.data;
				cur.data=index.data;
				index.data=temp;
				
				}
		index=index.next;
			
		}
			
		cur=cur.next;
	}}
 
	return list;
	
}
}



//main class

public class ordered {

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
String str=new String(Files.readAllBytes(Paths.get("C:\\Users\\Manoj\\eclipse-workspace\\assignment1\\src\\output.txt")));		
int n1=str.length();

String[]str1=new String[n1];

int n=str1.length;

@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);

str1=str.split(" ");
list list=new list();
for(int i=0;i<str1.length;i++) {
	
list=list.add(list, str1[i]);
}

System.out.println("Enter element to search");
String in=sc.next();

list=list.search(list,in);
//Writing into file
	
File f=new File("C:\\Users\\Manoj\\eclipse-workspace\\assignment1\\src\\output.txt");
FileWriter fw=new FileWriter(f);
String str2=list.print(list);

fw.write(str2);
fw.flush();
fw.close();
	}

}