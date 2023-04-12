package aqa.course.tasks.step5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 8, 12, 4};

        int[] resultArray = new int[array1.length + array2.length];
        // First variant
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i];
        }

        int resultArrayIndex = array1.length;
        for (int element : array2) {
            resultArray[resultArrayIndex] = element;
            resultArrayIndex++;
        }

        System.out.println(Arrays.toString(resultArray));
        // Second variant
        int[] resultArray2 = new int[array1.length + array2.length];

        int longerArrayLength = (array1.length - array2.length) > 0 ? array1.length : array2.length;
        for (int i = 0, j = array1.length; i < longerArrayLength; i++, j++) {
            if (i < array1.length) {
                resultArray2[i] = array1[i];
            }
            if (i < array2.length) {
                resultArray2[j] = array2[i];
            }
        }
        System.out.println(Arrays.toString(resultArray2));
        // .......
    }
}
