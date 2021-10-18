package by.stepanovichalena.task_03.task0303.logic;

import by.stepanovichalena.task_03.exception.Task03Exception;

public class ReplaceKSymbol {

    public String replaceSymbolRegular(String text, int k, char symbol) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");
        return text.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", k - 1), "$1" + symbol);
    }

    public String replaceSymbol(String text, int indexK, char symbol) throws Task03Exception {
        if (text == null) throw new Task03Exception("String is null");
        StringBuilder sb = new StringBuilder();
        if (text != null && text.length() > 0 && indexK > 0) {
            for (String word : text.split(" ")) {
                if (word.length() >= indexK) {
                    sb.append(word, 0, indexK - 1).append(symbol).append(word.substring(indexK));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

