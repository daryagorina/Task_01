package by.htp.les01.start;

public class Task29 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double aRad;
		double aDegree;
		
		double bRad;
		double bDegree;
		
		double cRad;
		double cDegree;
		
		a = 3.0;
	    b = 4.0;
	    c = 5.0;

	        // теорема косинусов
	    aRad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
	    aDegree = aRad * 180 / Math.PI;

	    bRad = Math.acos((a * a + c * c - b * b) / (2 * a * c));
	    bDegree = bRad * 180 / Math.PI;

	    cRad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
	    cDegree = cRad * 180 / Math.PI;

	        
	    System.out.println("Угол a = " + aRad + " рад. " + aDegree + " гр.");
	    System.out.println("Угол b = " + bRad + " рад. " + bDegree + " гр.");
	    System.out.println("Угол c = " + cRad + " рад. " + cDegree + " гр.");
		
		 

	}

}
