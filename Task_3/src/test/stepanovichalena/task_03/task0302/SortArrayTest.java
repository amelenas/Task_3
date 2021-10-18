package test.stepanovichalena.task_03.task0302;

import by.stepanovichalena.task_03.task0302.logic.MaxElement;
import by.stepanovichalena.task_03.task0302.logic.MinElement;
import by.stepanovichalena.task_03.task0302.logic.SortArray;
import by.stepanovichalena.task_03.task0302.logic.SumOfElements;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayTest {
    int[][] jaggedArray = { {1, 1, 1, 2},
                            {1, 1, 1, 2},
                            {2, 2, 2, 30},
                            {3, 25, 3, 4},
                            {4, 4, 4, 5}};
    @Test
    public void maxValue(){
        SortArray sortArrayMax = new SortArray(jaggedArray, new MaxElement());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }
    @Test
    public void minValue(){
        SortArray sortArrayMax = new SortArray(jaggedArray, new MinElement());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }

    @Test
    public void arraySum(){
        SortArray sortArrayMax = new SortArray(jaggedArray, new SumOfElements());
        sortArrayMax.ascendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        sortArrayMax.descendingOrder();
        System.out.println(Arrays.deepToString(jaggedArray));
        System.out.println();
    }

}