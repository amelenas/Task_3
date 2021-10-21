package by.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class AllPrimeNumbers {

    public int[] allPrimeNumbers(int[] array) throws Task03Exception {
        if (array == null) {
            throw new Task03Exception("Array is null.");
        }
        int length = 0;

        int[] tempArray = new int[array.length];
        for (int number : array) {
            if (isPrime(number)) {
                tempArray[length] = number;
                length++;
            }
        }
        int[] result = new int[length];
        System.arraycopy(tempArray, 0, result, 0, length);
        return result;
    }

    private boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
