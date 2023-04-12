package aqa.course.tasks.step6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String sentence = scanner.nextLine();

        String resultSentence = "";
        char[] array = sentence.toCharArray();
        int firstIndex = 0;
        int lastIndex;
        for (int i = 1; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                lastIndex = i;
                resultSentence = resultSentence.concat(sentence.substring(firstIndex, lastIndex)).concat(" ");
                firstIndex = i;
            } else if (i == array.length - 1) {
                resultSentence = resultSentence.concat(sentence.substring(firstIndex, array.length));
            }
        }
        System.out.println(resultSentence);
    }
}
