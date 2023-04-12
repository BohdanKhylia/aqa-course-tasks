package aqa.course.tasks.step4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type an int value:");
        int scannedValue = scanner.nextInt();
        // First variant
        int largestDivisor1 = 1;
        for (int i = scannedValue - 1; i > 1; i--) {
            if (scannedValue % i == 0) {
                largestDivisor1 = i;
                break;
            }
        }
        System.out.println("Largest divisor for " + scannedValue + " is " + largestDivisor1);
        // Second variant
        int largestDivisor2 = 1;
        for (int i = 1; i < scannedValue; i++) {
            if (scannedValue % i == 0) {
                largestDivisor2 = i;
            }
        }
        System.out.println("Largest divisor for " + scannedValue + " is " + largestDivisor2);
    }
}
