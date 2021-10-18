package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;


public class MinAndMaxValue {
    private static String errorMessage = "Array is null.";

    public int maxValue(int[] array) throws Task03Exception {
        if (array == null) throw new Task03Exception(errorMessage);
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public int minValue(int[] array) throws Task03Exception {
        if (array == null) throw new Task03Exception(errorMessage);
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

}
