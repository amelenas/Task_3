package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class BinarySearch {
    private static String errorMessage = "Array is null.";

    public int searchIteratively(int[] sortedArray, int elementToSearch) throws Task03Exception {
        if (sortedArray == null) {
            throw new Task03Exception(errorMessage);
        }
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;

            if (sortedArray[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (sortedArray[middleIndex] < elementToSearch)
                low = middleIndex + 1;

            else if (sortedArray[middleIndex] > elementToSearch)
                high = middleIndex - 1;

        }
        return -(sortedArray.length + 1);
    }
}
