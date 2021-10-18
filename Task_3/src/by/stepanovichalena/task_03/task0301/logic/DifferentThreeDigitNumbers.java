package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class DifferentThreeDigitNumbers {
    private static String errorMessage = "Array is null.";

    public int[] findThreeDifferentDigits(int[] array) throws Task03Exception {
        if (array == null) throw new Task03Exception(errorMessage);

        int[] tempArray = new int[array.length];
        int length = 0;
        for (int number : array) {
            if (isThreeDigitNumber(number) && !isSameDigit(number))
                tempArray[length++] = number;
        }
        int[] result = new int[length];
        System.arraycopy(tempArray, 0, result, 0, length);
        return result;
    }

    private boolean isThreeDigitNumber(int number) {
        int moduleNumber = Math.abs(number);
        return moduleNumber > 99 && moduleNumber < 1000;
    }

    private boolean isSameDigit(int number) {
        boolean isSame = false;
        boolean[] digits = new boolean[10];
        int iteration = 0;
        while (iteration < 11 && number != 0) {
            int digit = number % 10;
            if (digits[digit]) {
                isSame = true;
                break;
            }
            digits[digit] = true;
            number /= 10;
            iteration++;
        }
        if (iteration > 10) isSame = true;
        return isSame;
    }
}
