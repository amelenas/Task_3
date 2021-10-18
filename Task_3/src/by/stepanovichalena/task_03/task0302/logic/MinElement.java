package by.stepanovichalena.task_03.task0302.logic;

import by.stepanovichalena.task_03.task0302.util.CompareLogic;

public class MinElement implements CompareLogic {

    private int minimumOfElements(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue < array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    @Override
    public int compareLogic(int[] firstArray, int[] secondArray) {
        if (minimumOfElements(firstArray) < minimumOfElements(secondArray)) {
            return 1;
        } else if (minimumOfElements(firstArray) > minimumOfElements(secondArray)) {
            return -1;
        } else {
            return 0;
        }
    }

}

