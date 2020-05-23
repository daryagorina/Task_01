package by.htp.les01.start;

public class Task25 {

	public static void main(String[] args) {
		//ах2+ bх + с = 0
		double a;
		double b;
		double c;
		
		double d;
		
		double x1;
		double x2;
		

        a = 1.0;
        b = 2.0;
        c = -3.0;

        d = b * b - 4 * a * c;
        x1 = (- b + Math.sqrt(d)) / (2 * a);
        x2 = (- b - Math.sqrt(d)) / (2 * a);

        
        System.out.println("x1 = " + x1 + ", x2 = " + x2);

	}

}
