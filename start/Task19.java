package by.htp.les01.start;

public class Task19 {

	public static void main(String[] args) {
		// площадь этого треугольника,
		//его высоту,
		//радиусы вписанной
		//и описанной окружностеи
		
		int a = 10;
		double s;
		double h;
		double r;
		double r1;
		
		
		h = Math.sqrt(3) / 2 * a;
		s = Math.sqrt(3) / 4 * Math.pow(a, 2);
		r = a / (2 * Math.sqrt(3));
		r1 = a / Math.sqrt(3);
		
		
		System.out.println("S треугольника : " + s);
		System.out.println("h треугольника : " +  h);
		System.out.println("r вписанной окружности : " + r);
		System.out.println("R описанной кружности :" + r1);
		
		
		
		
		
	}

}