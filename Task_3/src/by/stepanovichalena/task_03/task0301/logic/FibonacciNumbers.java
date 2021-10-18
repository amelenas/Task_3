package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class FibonacciNumbers {
    private static String errorMessage = "Array is null.";

    public int[] findFibonacciNumbers(int[] array) throws Task03Exception {
        if (array == null) throw new Task03Exception(errorMessage);

        int[] fibonacciArray = new int[array.length];
        int length = 0;

        for (int number : array) {
            if (isFibonacci(number))
                fibonacciArray[length++] = number;
        }
        int[] result = new int[length];
        System.arraycopy(fibonacciArray, 0, result, 0, length);

        return result;
    }

    private boolean isFibonacci(int number) {
        int tempValue = 5 * number * number;
        return (Math.sqrt(tempValue + 4) % 1 == 0 || Math.sqrt(tempValue - 4) % 1 == 0) && number >= 0;
    }
}
