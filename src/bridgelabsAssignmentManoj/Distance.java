package bridgelabsAssignmentManoj;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,x1=0,y1=0;
		System.out.println(args[0]+','+args[1]);
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		double distance=Math.sqrt(Math.pow((x - x1),2) + Math.pow((y - y1),2));
		System.out.println(distance);
	}

}
