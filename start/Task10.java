package by.htp.les01.start;

public class Task10 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		
		double z;
		
		
		x= 60;
		y= 45;
		
		
		double temp1;
		double temp2;
		double temp3;
		
		temp1 = Math.sin(x) + Math.cos(y);
		temp2 = Math.cos(x) - Math.sin(y);
		temp3 = Math.tan( x * y );
		
		z = temp1 / temp2 * temp3;
		
		
		System.out.println("z = " + z);
		
	
	}

}
