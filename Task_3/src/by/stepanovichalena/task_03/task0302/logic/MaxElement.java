package by.stepanovichalena.task_03.task0302.logic;

import by.stepanovichalena.task_03.task0302.util.CompareLogic;

public class MaxElement implements CompareLogic {

    private int maximumOfElements(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    @Override
    public int compareLogic(int[] firstArray, int[] secondArray) {
        if (maximumOfElements(firstArray) > maximumOfElements(secondArray)) {
            return 1;
        } else if (maximumOfElements(firstArray) < maximumOfElements(secondArray)) {
            return -1;
        } else {
            return 0;
        }
    }
}

