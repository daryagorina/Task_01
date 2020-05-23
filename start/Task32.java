package by.htp.les01.start;

public class Task32 {

	public static void main(String[] args) {
		
		
		int hoursCurrent = 23;
        int minutesCurrent = 23;
        int secondsCurrent = 14;

        int hoursInterval = 23;
        int minutesInterval = 59;
        int secondsInterval = 59;

        int currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
        int intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;

        int finalInSeconds = currentInSeconds + intervalInSeconds;

        int hoursFinal = (finalInSeconds / 3600);

        int temp = finalInSeconds - (hoursFinal * 3600);
        int minutesFinal = temp / 60;

        int secondsFinal = temp - (minutesFinal * 60);

        int hours24Format = 0;
        if (hoursFinal > 23){
            temp = (hoursFinal / 24);
            hours24Format = hoursFinal - temp * 24;
        }
        else {
            hours24Format = hoursFinal;
            
        }

        System.out.println("Сейчас: " + hoursCurrent + " ч. " + minutesCurrent + " мин. " + secondsCurrent + " c.");
        System.out.println("Через: " + hoursInterval + " ч. " + minutesInterval + " мин. " + secondsInterval + " c.");
        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");
        System.out.println();
		
	}

}
