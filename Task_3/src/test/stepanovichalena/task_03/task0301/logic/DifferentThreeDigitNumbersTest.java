package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.DifferentThreeDigitNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class DifferentThreeDigitNumbersTest {
    int[] values = {1, 45, 654, 54, 465, 465, 999, 54, 564, 999, 654, 78, 32, 222, 4};
    DifferentThreeDigitNumbers differentThreeDigitNumbers = new DifferentThreeDigitNumbers();

    @Test
    public void findThreeDifferentDigitsPositive() throws Task03Exception {
        int[] expected = {654, 465, 465, 564, 654};
        int[] actual = differentThreeDigitNumbers.findThreeDifferentDigits(values);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findThreeDifferentDigitsNegative() throws Task03Exception {
        int[] valuesWithoutThreeDigits = {1, 45, 54, 54, 78, 32, 4};
        int[] expected = {};
        int[] actual = differentThreeDigitNumbers.findThreeDifferentDigits(valuesWithoutThreeDigits);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = Task03Exception.class)
    public void findThreeDifferentDigitsException() throws Task03Exception {
        int[] nullValues = null;
        differentThreeDigitNumbers.findThreeDifferentDigits(nullValues);
    }
}