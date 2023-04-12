package aqa.course.tasks.step4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an int value for calculating factorial:");
        int scannedValue = scanner.nextInt();
        // First variant
        int sum1 = 1;
        for (int i = scannedValue; i > 0; i--) {
            sum1 = sum1 * i;
        }
        System.out.println("Sum 1: " + sum1);
        // Second variant
        int sum2 = 1;
        for (int i = 1; i <= scannedValue; i++) {
            sum2 = sum2 * i;
        }
        System.out.println("Sum 2: " + sum2);
        // Third variant
        System.out.println("Sum 3: " + factorialCalculator(scannedValue));
    }

    static int factorialCalculator(int factorialNumber) {
        if (factorialNumber > 0) {
            return factorialNumber * factorialCalculator(factorialNumber - 1);
        } else {
            return 1;
        }
    }
}
