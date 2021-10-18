package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.AllPrimeNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllPrimeNumbersTest {
    AllPrimeNumbers allPrimeNumbers = new AllPrimeNumbers();

    @Test
    public void allPrimeNumbersPositive() throws Task03Exception {
        int[] numbers = {2, 3, 5, 7, 10, 12, 15};
        int[] expected = {2, 3, 5, 7};
        int[] actual = allPrimeNumbers.allPrimeNumbers(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void allPrimeNumbersNegative() throws Task03Exception {
        int[] numbers = {10, 12, 15, 18, 20, 22};
        int[] expected = {};
        int[] actual = allPrimeNumbers.allPrimeNumbers(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = Task03Exception.class)
    public void allPrimeNumbersException() throws Task03Exception {
        int[] numbers = null;
        allPrimeNumbers.allPrimeNumbers(numbers);
    }

}