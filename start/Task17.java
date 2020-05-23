package by.htp.les01.start;

public class Task17 {

	public static void main(String[] args) {
		
		
		double a = 2.3;
        double b = 4.5;

        double averageArithmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
        double averageGeometric = Math.sqrt(Math.abs(a) * Math.abs(b));

        System.out.println("Среднее арифметическое кубов чисел = " + averageArithmetic);
        System.out.println("Среднее геометрическое модулей чисел = " + averageGeometric);
      
	}
}
