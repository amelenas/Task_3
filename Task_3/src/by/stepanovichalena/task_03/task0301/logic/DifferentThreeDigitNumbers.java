package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class DifferentThreeDigitNumbers {

    public int[] findThreeDifferentDigits(int[] array) throws Task03Exception {
        if (array == null) throw new Task03Exception("Array is null.");

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
        final int minLimit = 99;
        final int maxLimit = 1000;
        int moduleNumber = Math.abs(number);
        return moduleNumber > minLimit && moduleNumber < maxLimit;
    }

    private boolean isSameDigit(int number) {
        boolean isSame = false;
        int dozen = 10;
        boolean[] digits = new boolean[dozen];
        int iteration = 0;
        while (iteration <= dozen && number != 0) {
            int digit = number % dozen;
            if (digits[digit]) {
                isSame = true;
                break;
            }
            digits[digit] = true;
            number /= dozen;
            iteration++;
        }
        if (iteration > dozen) isSame = true;
        return isSame;
    }
}
