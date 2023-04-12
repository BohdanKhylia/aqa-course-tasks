package aqa.course.tasks.step6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Type a letter to be count:");
        String letter = scanner.next();

        int lettersCount = 0;
        char[] array = sentence.toCharArray();
        for (char element : array) {
            if (letter.equals(String.valueOf(element))) {
                lettersCount++;
            }
        }
        System.out.println("Count of letter " + letter + " is " + lettersCount);
    }
}
