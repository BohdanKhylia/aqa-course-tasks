package aqa.course.tasks.step4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First variation
        boolean flag = true;
        while (flag) {
            System.out.println("Type an age value:");
            int scannedValue = scanner.nextInt();
            if (0 < scannedValue && scannedValue < 140) {
                System.out.println("Your age is correct!");
                flag = false;
            } else {
                System.out.println("Error. Your age is incorrect!");
            }
        }
        // Second variation
        while (true) {
            System.out.println("Type an age value:");
            int scannedValue = scanner.nextInt();
            if (0 < scannedValue && scannedValue < 140) {
                System.out.println("Your age is correct!");
                break;
            } else {
                System.out.println("Error. Your age is incorrect!");
            }
        }
    }
}
