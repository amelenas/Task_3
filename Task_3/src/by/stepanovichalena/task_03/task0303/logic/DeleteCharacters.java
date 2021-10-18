package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class DeleteCharacters {

    public String deleteCharactersRegular(String text) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");

        return text.replaceAll("[^А-Яа-яA-Za-z ]", "");
    }

    public String deleteCharacters(String text) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");
        int i = 0;
        String result = "";

        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || ch == ' ') {
                result = result + ch;
            } else {
                i++;
            }
        }
        return result;
    }
}
