package by.htp.les01.start;

public class Task35 {

	public static void main(String[] args) {
		
		
		int m = 987;
        int n = 123;

        double result = (double) m / n;

        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);

        System.out.println(m + " / " + n + " = " + result);
        System.out.println("Старшая цифра дробной части: " + older);
        System.out.println("Младшая цифра целой части: " + younger);

	}

}
