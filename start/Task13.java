package by.htp.les01.start;

public class Task13 {

	public static void main(String[] args) {
		
		
		
		 double x1 = 0.0;
	     double x2 = 3.0;
	     double x3 = 0.0;
	     double y1 = 0.0;
	     double y2 = 0.0;
	     double y3 = 4.0;
	     
	     
	     double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	     double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
	     double d = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
	        if (a + b <= d || a + d <= b || a + d <= b)
	            System.out.println("Треугольник не существует");
	        else
	        {
	            double p = (a + b + d) / 2.0;
	            double s = Math.sqrt(p * (p - a) * (p - b) * (p - d));
	            System.out.println("Площадь: " + s);
	        }                    

	}

}
