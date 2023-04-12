package aqa.course.tasks.step6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String sentence = scanner.nextLine();
        // First variation
        String resultSentence = "";
        if (sentence.contains("java")) {
            char[] array = sentence.toCharArray();
            for (int i = array.length - 1; i >= 0; i--) {
                resultSentence = resultSentence.concat(String.valueOf(array[i]));
            }
        } else {
            String[] array = sentence.split(" ");
            for (int i = 0; i < array.length; i++) {
                if ((i + 1) % 2 == 0) {
                    array[i] = array[i].toUpperCase();
                }
                resultSentence = resultSentence.concat(array[i]).concat(" ");
            }
        }
        System.out.println(resultSentence);
        // .........
    }
}
