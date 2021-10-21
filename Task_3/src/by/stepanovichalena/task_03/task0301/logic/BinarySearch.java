package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class BinarySearch {

    public int searchIteratively(int[] sortedArray, int elementToSearch) throws Task03Exception {
        if (sortedArray == null) {
            throw new Task03Exception("Array is null.");
        }
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;

            if (sortedArray[middleIndex] == elementToSearch) {
                return middleIndex+1;
            } else if (sortedArray[middleIndex] < elementToSearch)
                low = middleIndex + 1;

            else if (sortedArray[middleIndex] > elementToSearch)
                high = middleIndex - 1;

        }
        return -(sortedArray.length + 1);
    }
}
