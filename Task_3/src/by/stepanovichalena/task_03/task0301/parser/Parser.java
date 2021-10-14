package by.stepanovichalena.task_03.task0301.parser;


import java.util.ArrayList;
import java.util.List;


public class Parser {

    public static ArrayList<Integer> getCoordinatesFromFile(List <String> textLines, String delimiter) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String lines : textLines){
            String [] pointsString = lines.split(delimiter);
                for (int i = 0; i < pointsString.length; i++){
                    try {
                        numbers.add(Integer.valueOf(pointsString[i]));
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }
        }
        return numbers;
    }

}
