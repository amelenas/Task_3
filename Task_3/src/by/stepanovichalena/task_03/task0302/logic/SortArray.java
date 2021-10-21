package by.stepanovichalena.task_03.task0302.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0302.util.CompareLogic;

public class SortArray {

    private int[][] jaggedArray;
    private CompareLogic compareLogic;

    public SortArray(int[][] jaggedArray, CompareLogic compareLogic) throws Task03Exception {
        if (jaggedArray == null) {
            throw new Task03Exception("First array is null.");
        }
        this.jaggedArray = jaggedArray;
        this.compareLogic = compareLogic;
    }

    public void ascendingOrder() throws Task03Exception {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                if (compareLogic.compareLogic(jaggedArray[i], jaggedArray[j]) <= 0) {
                    jaggedRowSwapper(jaggedArray, i, j);

                }
            }
        }
    }

    public void descendingOrder() throws Task03Exception {
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length; j++) {
                if (compareLogic.compareLogic(jaggedArray[i], jaggedArray[j]) >= 0) {
                    jaggedRowSwapper(jaggedArray, i, j);

                }
            }
        }
    }

    private void jaggedRowSwapper(int[][] jaggedArray, int rowLength, int nextRowLength) {
        int[] lineOfArray;
        lineOfArray = jaggedArray[nextRowLength];
        jaggedArray[nextRowLength] = jaggedArray[rowLength];
        jaggedArray[rowLength] = lineOfArray;
    }
}
