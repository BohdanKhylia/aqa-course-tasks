package aqa.course.tasks.step5;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 10, 4, 3, 12, 14, 9, 7};

        int largestElement = 0;
        for (int element : array) {
            if (element > largestElement) {
                largestElement = element;
            }
        }
        System.out.println("Largest element " + largestElement);
    }
}
