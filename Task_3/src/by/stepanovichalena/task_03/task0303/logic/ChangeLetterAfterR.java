package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class ChangeLetterAfterR {
    private static final String errorMessage = "Text is empty.";

    public String changeLetterAfterRRegular(String text) throws Task03Exception {
        if (text == null) {throw new Task03Exception(errorMessage);}

        return text.replaceAll("Р[А]", "РО");
    }

    public String changeLetterAfterR(String text, String CharactersToChange, String CharacterToReplaceWith) throws Task03Exception {
        if (text == null) {throw new Task03Exception(errorMessage);}

        return text.replaceAll(CharactersToChange, CharacterToReplaceWith);
    }



}

