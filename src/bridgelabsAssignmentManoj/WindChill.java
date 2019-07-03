package bridgelabsAssignmentManoj;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double t=Double.parseDouble(args[0]);
	double w=Double.parseDouble(args[1]);
	System.out.println("Given degree  in Celsius "+t+" Given Speed in killometer "+w);
	if(t<50 && w<120 && w>3)
	{
	t=(t*1.8)+32;//Degree to Fra convertion
	System.out.println("Fahrenheit is" +t);
	w=w/1.6;//kelometers to miles 
	System.out.println("Miles is  "+w);
	double windChill=(35.74+(t*0.6215)+((0.4275*t)-35.75)*Math.pow(w, 0.16));
	System.out.println("Wind Chill is  "+windChill);
	}}

}
