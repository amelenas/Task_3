package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class DeleteWordByLength {
    private static final String errorMessage = "Text is empty.";

    public String deleteWordByLengthRegular(String text, int length) throws Task03Exception {
        if (text == null || length <=0) {
            throw new Task03Exception(errorMessage);
        }

        String[] words = text.split("\\b");
        StringBuilder result = new StringBuilder();
        String pattern = "[B-DF-HJ-NP-TV-Zb-df-hj-np-tv-z]\\w{" + (length - 1) + "}";

        for (String word : words) {
            if (!word.matches(pattern)) {
                result.append(word);
            }
        }
        return result.toString();
    }

    public String deleteWordByLength(String text, int length) throws Task03Exception {
        if (text == null || length <=0) {
            throw new Task03Exception(errorMessage);
        }
        StringBuilder result = new StringBuilder();
        String pattern = "(?=[ ,.?!])";
        for (String word : text.split(pattern)) {
            if (!(word.trim().length() == length) && !containsConsonant(word)) {
                result.append(word);
            }
        }
        return result.toString().trim();
    }

    private boolean containsConsonant(String word) {
        String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩBCDFGHJKLMNPQRSTVWXYZ";
        boolean result = false;
        if (word.trim().length() > 0) {
            result = consonants.indexOf(Character.toUpperCase(word.charAt(0))) == 1;
        }
        return result;
    }
}

