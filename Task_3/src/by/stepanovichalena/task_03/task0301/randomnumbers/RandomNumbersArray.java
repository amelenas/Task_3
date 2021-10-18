package by.stepanovichalena.task_03.task0301.randomnumbers;

import java.util.Random;

public class RandomNumbersArray {
    public int[] randomNumbersArray(int arrayLength, int minInteger, int maxInteger) {
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            Random random = new Random();
            result [i] = random.nextInt(maxInteger) + minInteger;
        }
        return result;
    }

}
