package bridgelabsAssignmentManoj;

import java.util.ArrayList;
import java.util.List;

public class DayoftheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> day=new ArrayList<String>();
		day.add("sunday");
		day.add("monday");
		day.add("Tuesday");
		day.add("wednesday");
		day.add("thursday");
		day.add("Friday");
		day.add("saturday");
		
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		int y0=y-(14-m)/12;
		
				int x = y0 + y0/4-y0/100 + y0/400;
				int m0 =  m + 12 *((14- m) / 12)- 2;
				int d0 = (d + x + 30*m0/12)%7;
				System.out.println("The day of the given date "+m+"-"+d+"-"+y+" is  "+day.get(d0));
				//System.out.println(x);
		

	}

}
