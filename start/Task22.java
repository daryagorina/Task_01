package by.htp.les01.start;

public class Task22 {

	public static void main(String[] args) {
		
		
		int init = 4567;

        int hours = (init / 3600);

        int temp = init - (hours * 3600);
        int minutes = temp / 60;

        int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + init);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
      
   
	}

}
