package test.stepanovichalena.task_03.task0302;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0302.logic.MaxElement;
import by.stepanovichalena.task_03.task0302.logic.MinElement;
import by.stepanovichalena.task_03.task0302.logic.SortArray;
import by.stepanovichalena.task_03.task0302.logic.SumOfElements;
import org.junit.Test;

import java.util.Arrays;

public class SortArrayTest {
    int[][] jaggedArray = { {1, 1, 1, 2},
                            {1, 1, 1, 2},
                            {2, 2, 2, 30},
                            {3, 25, 3, 4},
                            {4, 4, 4, 5}};
    int[][] jaggedArrayNull = { {},
                                {},
                                {2, 2, 2, 30},
                                {3, 25, 3, 4},
                                {4, 4, 4, 5}};

    @Test
    public void maxValue() throws Task03Exception {
        SortArray sortArrayMax = new SortArray(jaggedArray, new MaxElement());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }

    @Test
    public void minValue() throws Task03Exception {
        SortArray sortArrayMax = new SortArray(jaggedArray, new MinElement());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }

    @Test
    public void arraySum() throws Task03Exception {
        SortArray sortArrayMax = new SortArray(jaggedArray, new MaxElement());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }

    @Test(expected = Task03Exception.class)
    public void maxValueNull() throws Task03Exception {
        SortArray sortArrayMax = new SortArray(jaggedArrayNull, new MaxElement());
        sortArrayMax.ascendingOrder();

    }

    @Test(expected = Task03Exception.class)
    public void minValueNull() throws Task03Exception {
        SortArray sortArrayMax = new SortArray(jaggedArrayNull, new MinElement());
        sortArrayMax.ascendingOrder();

    }
}