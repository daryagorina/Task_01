package by.htp.les01.start;

public class Task33 {

	public static void main(String[] args) {
		

        char currentCharacter = 'A';



        int asciiCurrent = (int) currentCharacter;

        int asciiPrev = asciiCurrent - 1;
        char prevCharacter = (char) asciiPrev;

        int asciiNext = asciiCurrent + 1;
        char nextCharacter = (char) asciiNext;

        System.out.println("Исходный символ: " + currentCharacter + ", его номер: " + asciiCurrent);
        System.out.println("Предыдущий символ: " + prevCharacter + ", его номер: " + asciiPrev);
        System.out.println("Следующий символ: " + nextCharacter + ", его номер: " + asciiNext);
        
		
		

	}

}
