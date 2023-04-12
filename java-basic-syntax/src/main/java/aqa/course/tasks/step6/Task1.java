package aqa.course.tasks.step6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a sentence:");
        String sentence = scanner.nextLine().replaceAll(" ", "").toUpperCase();

        for (char element : sentence.toCharArray()) {
            System.out.println(element);
        }
    }
}
