package aqa.course.tasks.step5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 6, 1, -4, 14, 8, 9, 0, 5, 4};

        // First variant
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                int currentElement = array1[j];
                if (currentElement > array1[j + 1]) {
                    array1[j] = array1[j + 1];
                    array1[j + 1] = currentElement;
                }
            }
        }
        System.out.println(Arrays.toString(array1));

        // Second variant
        int[] array2 = {3, 4, 6, 1, -5, 14, 8, 9, 0, 5, 4, 16};

        for (int i = 0; i < array2.length; i++) {
            int indexOfMinimal = i;
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[indexOfMinimal] > array2[j]) {
                    indexOfMinimal = j;
                }
            }
            int minimalElement = array2[indexOfMinimal];
            array2[indexOfMinimal] = array2[i];
            array2[i] = minimalElement;
        }
        System.out.println(Arrays.toString(array2));
        // Third variant(Bubble sorting)
        int[] array3 = {3, 4, 6, 1, -1, 14, 8, 9, 0, 5, 4, 1};

        sortArray(array3, array3.length);

        System.out.println(Arrays.toString(array3));
        // .......
    }

    static void sortArray(int[] array, int length) {
        if (length == 1) {
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int currentElement = array[i];
                array[i] = array[i + 1];
                array[i + 1] = currentElement;
            }
        }

        sortArray(array, length - 1);
    }
}
