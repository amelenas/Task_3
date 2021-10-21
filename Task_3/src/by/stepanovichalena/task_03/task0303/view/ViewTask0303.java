package by.stepanovichalena.task_03.task0303.view;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.reader.Readers;
import by.stepanovichalena.task_03.task0303.logic.*;

public class ViewTask0303 {
    public static void main(String[] args) {
        Readers readers = new Readers();
        String textFromFile = readers.readStringFromFile("data/Text.txt");
        try {
            System.out.println("In each word, replace the k-th letter with a symbol.");
            ReplaceKSymbol replaceKSymbol = new ReplaceKSymbol();

            System.out.println("String methods");
            String resultReplaceKSymbol = replaceKSymbol.replaceSymbol(textFromFile, 3, '*');
            System.out.println(resultReplaceKSymbol);

            System.out.println("Regular expressions");
            String resultReplaceKSymbolRegular = replaceKSymbol.replaceSymbolRegular(textFromFile, 3, '*');
            System.out.println(resultReplaceKSymbolRegular + "\n");


            System.out.println("Replacing the letter A after P with the letter O");
            ChangeLetterAfterR changeLetterAfter = new ChangeLetterAfterR();
            String text = "РарAРAрара РОРОРАРАРА";

            System.out.println("String methods");
            String resultChangeLetterAfterR = changeLetterAfter.changeLetterAfterR(text, "РА", "РО");
            System.out.println(resultChangeLetterAfterR);

            System.out.println("\nRegular expressions");
            String resultChangeLetterAfterRRegular = changeLetterAfter.changeLetterAfterRRegular(text);
            System.out.println(resultChangeLetterAfterRRegular + "\n");

            System.out.println("Replace a word of the specified length with a substring");
            ReplaceWordOnSubstring replaceWordOnSubstring = new ReplaceWordOnSubstring();

            System.out.println("String methods");
            String replaceWord = replaceWordOnSubstring.replaceWords(textFromFile, 5, "******");
            System.out.println(replaceWord);

            System.out.println("\nRegular expressions");
            String replaceWordRegular = replaceWordOnSubstring.replaceWordsRegular(textFromFile, 5, "******");
            System.out.println(replaceWordRegular);

            System.out.println("Delete all characters except spaces that are not letters");
            DeleteCharacter deleteCharacter = new DeleteCharacter();
            System.out.println("String methods");
            String deleteChar = deleteCharacter.deleteSymbols(textFromFile);
            System.out.println(deleteChar);

            System.out.println("\nRegular expressions");
            String deleteCharRegular = deleteCharacter.deleteSymbolsRegular(textFromFile);
            System.out.println(deleteCharRegular);

            System.out.println("\nRemove from the text all words of a given length starting with a consonant letter");
            DeleteWordByLength deleteWordByLength = new DeleteWordByLength();
            System.out.println("String methods");
            String deleteWord = deleteWordByLength.deleteWordByLength(textFromFile, 3);
            System.out.println(deleteWord);
            System.out.println("\nRegular expressions");
            String deleteWordRegular = deleteWordByLength.deleteWordByLengthRegular(textFromFile, 3);
            System.out.println(deleteWordRegular);
        } catch (Task03Exception e) {
            e.printStackTrace();
        }
    }
}
