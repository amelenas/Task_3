package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.BinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class BinarySearchTest {
    int[] values = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
     BinarySearch binarySearch = new BinarySearch();

    @Test
    public void searchIterativelyPositive() throws Task03Exception {
        int expected = 3;
        int actual = binarySearch.searchIteratively(values, 45);
        assertEquals(expected, actual);

    }

    @Test
    public void searchIterativelyNegative() throws Task03Exception {
        int expected = -23;
        int actual = binarySearch.searchIteratively(values, 999);
        assertEquals(expected, actual);
    }

    @Test
    public void searchIterativelyEqualNumbers() throws Task03Exception {
        int expected = -23;
        System.out.println(Arrays.binarySearch(values, 654));
        int actual = binarySearch.searchIteratively(values, 654);
        assertEquals(expected, actual);
    }

    @Test
    public void searchIterativelyEqualNumbersSorted() throws Task03Exception {
        int expected = 20;
        Arrays.sort(values);
        int actual = binarySearch.searchIteratively(values, 654);
        assertEquals(expected, actual);
    }

    @Test (expected = Task03Exception.class)
    public void searchIterativelyException() throws Task03Exception {
        int[] values = null;
         binarySearch.searchIteratively(values, 654);
    }

}