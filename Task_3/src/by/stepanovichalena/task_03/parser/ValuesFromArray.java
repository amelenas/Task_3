package by.stepanovichalena.task_03.parser;


import by.stepanovichalena.task_03.exception.Task03Exception;

import java.util.ArrayList;
import java.util.List;


public class ValuesFromArray {
    private static String errorMessage = "Array is null.";

    public int[] digitsFromArray(List<String> textLines, String delimiter) throws Task03Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        if (textLines == null) {
            throw new Task03Exception(errorMessage);
        }

        for (String lines : textLines) {
            String[] pointsString = lines.split(delimiter);
            for (int i = 0; i < pointsString.length; i++) {
                try {
                    numbers.add(Integer.valueOf(pointsString[i].trim()));
                } catch (NumberFormatException e) {
                }
            }
        }

        int[] coordinates = new int[numbers.size()];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = numbers.get(i);
        }
        return coordinates;
    }
}
