package by.htp.les01.start;

public class Task26 {

	public static void main(String[] args) {
		
		
		double a;
		double b;
		double y;
		
		double yRad;
		
		double s;
		
		
		a = 20.0;
        b = 30.0;
	    y = 40.0;

	    
	   yRad = y * Math.PI / 180.0;

	   s = 0.5 * a * b * Math.sin(yRad);

	    System.out.println("Площадь треугольника с a = " + a + ", b = " + b + " и y = " + y + " равна " + s);

	}

}
