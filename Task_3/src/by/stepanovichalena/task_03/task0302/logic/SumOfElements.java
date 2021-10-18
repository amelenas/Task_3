package by.stepanovichalena.task_03.task0302.logic;

import by.stepanovichalena.task_03.task0302.util.CompareLogic;

public class SumOfElements implements CompareLogic {

    private int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public int compareLogic(int[] firstArray, int[] secondArray) {
        if (sumOfElements(firstArray) > sumOfElements(secondArray)) {
            return 1;
        } else if (sumOfElements(firstArray) < sumOfElements(secondArray)) {
            return -1;
        } else {
            return 0;
        }
    }

}

