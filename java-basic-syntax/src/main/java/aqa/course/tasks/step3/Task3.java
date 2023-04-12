package aqa.course.tasks.step3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a float value:");
        float scannedValue = scanner.nextFloat();

        if ((scannedValue % 2 == 0.0 && scannedValue > 10) || scannedValue == 15) {
            System.out.println("First message!");
        } else {
            System.out.println("Second message!");
        }
    }
}
