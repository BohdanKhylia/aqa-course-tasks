package aqa.course.tasks.step4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an int value:");
        int scannedValue = scanner.nextInt();

        if (scannedValue < 0) {
            System.out.println("Error. Number is negative.");
        } else {
            System.out.println("Value 0");
        }

        // First variation
        for (int i = 1; i <= scannedValue; i++) {
            if (i % 3 == 0) {
                System.out.println("The value is multiple to 3. Value " + i);
                continue;
            }
            System.out.println("Value " + i);
            if (i % 2 == 0) {
                System.out.println("The value is even. Value " + i);
            }
        }
        // Second variation
        for (int i = 1; i <= scannedValue; i++) {
            if (i % 3 == 0) {
                System.out.println("The value is multiple to 3. Value " + i);
            } else {
                System.out.println("Value " + i);
                if (i % 2 == 0) {
                    System.out.println("The value is even. Value " + i);
                }
            }
        }
    }
}
