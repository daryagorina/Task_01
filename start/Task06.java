package by.htp.les01.start;

public class Task06 {

	public static void main(String[] args) {
		
		
		int n;   //количество малых бедонов
		int m;   //количество больших бедонов
		int a;   //молоко в малых бедонах общее количество
		int b;   //молоко в 1 маленьком бедоне
		int c;   //молоко в 1 большом бедоне
		int d;   //молоко в больших бедонах общее количество
		
		n=4;
		m=6;
		a=80;
		b=a/n;
		c=b+12;
		d=m*c;
		
		System.out.println(" Молока в больших бедонах " + d + " литра ");
		
	}

}
