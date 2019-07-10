package  bridgelabsAssignmentManoj;

public class Queue<Q> {
Q data;
public Queue next;
Q pur;

Queue(Q data,Q pur){
	this.data=data;
	this.pur=pur;
	next=null;
}
}
