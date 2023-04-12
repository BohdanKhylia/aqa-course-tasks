package aqa.course.tasks.step3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a double value:");
        double scannedValue = scanner.nextDouble();

        if (scannedValue % 2 == 0.0) {
            System.out.println("Value " + scannedValue + " is even!");
        } else {
            System.out.println("Value " + scannedValue + " is odd!");
        }
    }
}
