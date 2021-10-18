package test.stepanovichalena.task_03.task0301.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.SortArrays;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArraysTest {
    SortArrays sortArrays = new SortArrays();

    @Test
    public void bubbleSort() throws Task03Exception {
        int[] values = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        int[] values2 = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        sortArrays.bubbleSort(values);
        Arrays.sort(values2);
        assertArrayEquals(values, values2);

    }

    @Test (expected = Task03Exception.class)
    public void bubbleSortException() throws Task03Exception {
        int [] values = null;
        sortArrays.bubbleSort(values);
    }

    @Test
    public void insertionSort() throws Task03Exception {
        int[] values = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        int[] values2 = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        sortArrays.insertionSort(values);
        Arrays.sort(values2);
        assertArrayEquals(values, values2);

    }

    @Test (expected = Task03Exception.class)
    public void insertionSortException() throws Task03Exception {
        int [] values = null;
        sortArrays.insertionSort(values);
    }

    @Test
    public void shuttleSort() throws Task03Exception {
        int[] values = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        int[] values2 = {1, 3, 6, 45, 654, 54, 65, 465, 465, 46, 54, 564, 87, 9, 8, 654, 78, 54, 21, 32, 5, 4};
        sortArrays.shuttleSort(values);
        Arrays.sort(values2);
        assertArrayEquals(values, values2);
    }

    @Test (expected = Task03Exception.class)
    public void shuttleSortException() throws Task03Exception {
        int [] values = null;
        sortArrays.shuttleSort(values);
    }
}