package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class ChangeLetterAfterR {

    public String changeLetterAfterRRegular(String text) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");

        String result =  text.replaceAll(String.format("\\р[а]"), "ро");
        return result.replaceAll(String.format("\\Р[а]"), "Ро");
    }

    public String changeLetterAfterR(String text) throws Task03Exception {
         if (text == null) throw new Task03Exception("String is null");
         String result =  text.replaceAll("Ра", "Ро");
       return result.replaceAll("ра", "ро");
    }



}

