package by.stepanovichalena.task_03.task0302.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0302.util.CompareLogic;

public class MinElement implements CompareLogic {

    private int minimumOfElements(int[] array) {
        int minValue = array[0];
        for (int j : array) {
            if (minValue < j) {
                minValue = j;
            }
        }
        return minValue;
    }

    @Override
    public int compareLogic(int[] firstArray, int[] secondArray) throws Task03Exception {
        if (firstArray == null || firstArray.length ==0 ) {
            throw new Task03Exception("First array is null.");
        }if (secondArray == null || secondArray.length ==0 ) {
            throw new Task03Exception("Second array is null.");
        }
        if (minimumOfElements(firstArray) < minimumOfElements(secondArray)) {
            return 1;
        } else if (minimumOfElements(firstArray) > minimumOfElements(secondArray)) {
            return -1;
        } else {
            return 0;
        }
    }

}

