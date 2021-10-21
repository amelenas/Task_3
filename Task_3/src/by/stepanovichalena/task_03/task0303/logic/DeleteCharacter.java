package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class DeleteCharacter {
    private static final String errorMessage = "Text is empty.";

    public String deleteSymbolsRegular(String text) throws Task03Exception {
        if (text == null) {
            throw new Task03Exception(errorMessage);
        }
        return text.replaceAll("[^А-Яа-яA-Za-z ]", "");
    }

    public String deleteSymbols(String text) throws Task03Exception {
        if (text == null) {
            throw new Task03Exception(errorMessage);
        }
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || ch == ' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
