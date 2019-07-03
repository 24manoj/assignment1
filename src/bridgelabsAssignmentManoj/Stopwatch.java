package bridgelabsAssignmentManoj;

import java.util.Scanner;

class time{
	 float start;
	  float end;
	boolean running;
	public void start()
	{
		this.start=System.nanoTime();
		this.running=true;
		System.out.println("Timer Started"+start);
	}
	public void stop()
	{
		this.end=System.nanoTime();
		this.running=false;
		System.out.println("Timer Stoped"+end);
	}
	public void ElapsedTime()
	{
		if(running) {
			System.out.println("Elpased Time"+(System.nanoTime()-start));
		}
		else
		{
			System.out.println("Elapsed Time  "+(end-start));
		}
	}
}
public class Stopwatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		time t=new time();
			for(;;) {
				System.out.println("\n1)yes to start\n2)NO to Stop\n3)Elp to ElapsedTime");
				String choice=sc.next();
			switch(choice) {
			case "yes":
				if(t.running!=true) {
					t.start();
					
				}
				else {System.out.println("Timer  already started");}
					break;
		     case "no":
					if(t.running!=false) {
						t.stop();
						t.ElapsedTime();
					}
		    
					else {System.out.println("Timer already stoped");}
						break;
		     case "elp":
		    	 t.ElapsedTime();
		    	 break;
				  default:System.exit(0);
				}
			}
		}
		
		
		
	}

