package bridgelabsAssignmentManoj;

import java.util.Scanner;

class plaindrom
{
	DoubleEndedQueue front;
	DoubleEndedQueue rear;

	public  void dqueue()
	{
		front=null;
		rear=null;
		
	}
	public void addRear(char data) {
		DoubleEndedQueue newnode=new DoubleEndedQueue(data);
		if(isEmpty() ) {
			front=newnode;
			rear=newnode;
		}else {
	   rear.next=newnode;
	   newnode.prev=rear;
		rear=newnode;
				}
				}
		public void addFront(char data) {
			DoubleEndedQueue newnode=new DoubleEndedQueue(data);
			if(isEmpty() ) {
				front=newnode;
				rear=newnode;}
			else
			{
				DoubleEndedQueue temp=front;
				temp.prev=newnode;
				newnode.next=temp;
				front=newnode;
				}
}
		
public boolean palindromcheck() 
{
	if(isEmpty()) {System.out.println("Queue is empty..To check");
	return false;}
	else 
	{
		DoubleEndedQueue temp,temp1;
		temp=front;temp1=rear;
		while(temp!=temp1) {
		;
			if(temp1.data== temp.data)
			{	
				temp=temp.next;
			   temp1=temp1.prev;
			}
				else
          return false;
		}
		return true;
	
		
	}
}
		
public int size()
{
	if(isEmpty())return -1;
	else
	{int c=0;
		DoubleEndedQueue temp=front;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
			}

}
public boolean isEmpty() {
if(front==null && rear==null)return true;
else return false;
}
}

public class doublequeue {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 plaindrom q=new  plaindrom();
		System.out.println("Enter string to check palindrom");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char [] a=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			q.addRear(a[i]);
		}
		if(q.palindromcheck()) System.out.println("String is palindrom");
		else System.out.println("Not a palindrom");
		

	}

}
