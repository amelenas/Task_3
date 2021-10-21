package by.stepanovichalena.task_03.task0302.view;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0302.logic.MaxElement;
import by.stepanovichalena.task_03.task0302.logic.MinElement;
import by.stepanovichalena.task_03.task0302.logic.SortArray;
import by.stepanovichalena.task_03.task0302.logic.SumOfElements;

import java.util.Arrays;

public class ViewTask0302 {
    public static void main(String[] args) {
        int[][] jaggedArray = { {1, 1, 1, 2},
                                {1, 0, 1, 2},
                                {2, 2, 2, 30},
                                {3, 25, 3, 4},
                                {4, 4, 4, 5}};


        MaxElement maxElement = new MaxElement();
        MinElement minElement = new MinElement();
        SumOfElements sumOfElements = new SumOfElements();

        try {
            System.out.println("Sorting an array in sum of the elements");
            SortArray sortArraySum = new SortArray(jaggedArray, sumOfElements);

            System.out.println("Ascending order");
            sortArraySum.ascendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));

            System.out.println("Descending order");
            sortArraySum.descendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));

            System.out.println("Sorting an array by the maximum of elements");
            SortArray sortArrayMax = new SortArray(jaggedArray, maxElement);
            System.out.println("Ascending order");
            sortArrayMax.ascendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));

            System.out.println("Descending order");
            sortArrayMax.descendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));

            System.out.println("Sorting an array by the minimum of elements");
            SortArray sortArrayMin = new SortArray(jaggedArray, minElement);
            System.out.println("Ascending order");
            sortArrayMin.ascendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));

            System.out.println("Descending order");
            sortArrayMin.descendingOrder();
            System.out.println(Arrays.deepToString(jaggedArray));


        } catch (Task03Exception e) {
            e.printStackTrace();
        }


    }
}
