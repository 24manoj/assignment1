package bridgelabsAssignmentManoj;

import java.util.Scanner;

class stack{
	Node top;
public void stack()
	{
		this.top=null;
	}

public void push(char ele) {
Node n=new Node(ele);
n.next=top;
top=n;
}

public void pop()
	{
if(isEmpty())System.out.println("UnderFlow");
else top=top.next;
	}

public void peek() {
if(isEmpty())System.out.println("stack empty");
else System.out.println(" "+top.data);
	}

public int size()
	{
		if(isEmpty()) {System.out.println("empty stack");return 0;}
		else {
		int s= 0;
		Node cur=top;
			while(cur!=null) {
				s++;
				cur=cur.next;}
			return s;
		}}

	public boolean isEmpty()
	{
		if(top==null)return true;
		else return false;
	}}

public class balanced {
public  static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Expresion");
String 	str=sc.next();
stack s=new stack();
		s.stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(')
			{s.push('(');
			System.out.println("Size of stack "+s.size());
			}
			if(str.charAt(i)==')')s.pop();
		}
		if(s.isEmpty()) System.out.println("Expression has   well Balanced Paranthesis");
		else System.out.println("Expression is not  having Balanced paranthesis");
		}}
