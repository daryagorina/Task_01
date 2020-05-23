package by.htp.les01.start;

public class Task28 {

	public static void main(String[] args) {
		//Составить программу перевода радианной меры угла в градусы, минуты и секунды.
		
		double rad = 2;
		double degree;
		double min;
		double sec;
		
		degree = rad * 180 / Math.PI;
		min = rad * (60 * 180) / Math.PI;
		sec = rad * (3600 * 180) / Math.PI;
		
		System.out.println("2 радиана = " + degree+ " градусов; " + min +" мин; " + sec + " сек.");
		
		
	
		
	}

}
