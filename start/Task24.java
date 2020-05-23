package by.htp.les01.start;

public class Task24 {

	public static void main(String[] args) {
		
		 
		        System.out.println("24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.");

		        double a = 2.5;
		        double b = 1.7;
		        double corner = 45;

		        //перевод в радианы
		        double cornerRad = corner * Math.PI / 180.0;

		        double s = ((a * a - b * b) / 4) * Math.tan(cornerRad);

		        System.out.println("Площадь трапеции с a = " + a + ", b = " + b + " и α = " + corner + " равна " + s);

	}

}
