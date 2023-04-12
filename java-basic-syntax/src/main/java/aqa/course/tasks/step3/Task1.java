package aqa.course.tasks.step3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an int value:");
        int scannedValue = scanner.nextInt();

        if (scannedValue == 0) {
            System.out.println("Value equal to 0");
        } else if (scannedValue < 10) {
            System.out.println("Value is less than 10");
        } else {
            System.out.println("Value is lager than 10");
        }
    }
}
