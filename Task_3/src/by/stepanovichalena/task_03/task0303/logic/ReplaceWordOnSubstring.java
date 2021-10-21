package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class ReplaceWordOnSubstring {
    private static final String errorMessage = "Text is empty.";

    public String replaceWordsRegular(String text, int length, String substring) throws Task03Exception {
        if (text == null) {throw new Task03Exception(errorMessage);}

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "\\w{" + length + "}";

        for (String s : words) {
            String word = s;
            if (word.trim().matches(pattern)) {
                word = substring;
            }
            result.append(word);
        }
        return result.toString();
    }

    public String replaceWords(String text, int length, String substring) throws Task03Exception {
        if (text == null) {throw new Task03Exception(errorMessage);}
        StringBuilder result = new StringBuilder();
        String pattern = "\\b";
        for (String word : text.split(pattern)) {
            if (!(word.trim().length() == length)) {
                result.append(word);
            } else {
                result.append(" ").append(substring);
            }
        }
        return result.toString().trim();
    }
}
