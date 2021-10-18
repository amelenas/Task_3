package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.FibonacciNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {
    FibonacciNumbers fibonacci = new FibonacciNumbers();
    int[] values = {1, 3, 0, 6, 45, 654, 54, 65, 465, 610, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};

    @Test
    public void findFibonacciNumbersPositive() throws Task03Exception {
        int[] expected = {1, 3, 0, 610, 8, 21, 5};
        int[] actual = fibonacci.findFibonacciNumbers(values);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindFibonacciNumbersNegative() throws Task03Exception {
        int[] expected = {};
        int[] values = {6, 45, 654, 54, 65, 465, 46, 54, 564, 87, 9, 654, 78, 54, 32, 4};
        int[] actual = fibonacci.findFibonacciNumbers(values);
        assertArrayEquals(expected, actual);
    }

    @Test(expected = Task03Exception.class)
    public void testFindFibonacciNumbersException() throws Task03Exception {
        int[] nullValues = null;
        fibonacci.findFibonacciNumbers(nullValues);
    }
}