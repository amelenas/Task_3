package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class ReplaceWordOnSubstring {

    public String replaceWordsRegular(String text, int length, String substring) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");

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
        if (text == null) throw new Task03Exception("String is null");
        StringBuilder result = new StringBuilder();

        for (String word : text.split("[ ,.?!]")) {
            if (!(word.trim().length() == length)){
                result.append(" ").append(word);
            }else {
                result.append(" ").append(substring);
            }
        }
        return result.toString().trim();
    }
}
