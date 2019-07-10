package bridgelabsAssignmentManoj;

import java.util.Scanner;

class queuing{

	
	int cash=0;
	Queue front;
	Queue rear;
	public void queue()
	{
	
	front=null;
	rear=null;
	}
	
public void enqueue(int ele,String purpose) {
	Queue newnode=new Queue(ele,purpose);
	
	   if(this.front==null && this.rear==null) {
		rear=newnode;
		front=newnode;}
		else
		{Queue temp=rear;
		temp.next=newnode;
		rear=newnode;}
		}

public void deqeue()
{ 
if(isEmpty())System.out.println("underflow");

else if(front==rear){
	
if(front.pur=="withdraw") cash=cash-(int)front.data;
else cash=cash+(int)front.data;

		front=null;
		rear=null;
	}
	else
	{if("withdraw".equals(front.pur)) {
		cash=cash-(int)front.data;
		 System.out.println("in");}
	else 
		cash=cash+(int)front.data;
	
		Queue temp=front.next;
	    front=temp;
	
		}
}
public boolean isEmpty() {
	
	if( front==null && rear==null) return true;
	else return false;
	
}

public int size()
{
	if( front==null && rear==null) return -1;
	else 
	{Queue temp=front;
	int s=0;
	while(temp!=null) {
		s++;
		temp=temp.next;
	}return s;
	}
	
}
}

public class BankingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		queuing h=new queuing();
		h.queue();
		h.enqueue(20,"deposit");
    
        h.enqueue(10,"withdraw");
        h.deqeue();
        h.deqeue();
        System.out.println(h.size());
        h.enqueue(30,"deposit");
        h.deqeue();
        h.enqueue(30,"deposit");
        h.deqeue();
        System.out.println(h.size());
        System.out.println("Cash left is "+h.cash);
	}

}
