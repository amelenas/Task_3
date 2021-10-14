package by.stepanovichalena.task_03.task0301.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ConsoleReader {

    private Scanner scanner;

    public int readInt() {
        scanner = new Scanner(System.in);
        int result;
        System.out.println("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid number format.");
            scanner.nextLine();
        }
        result = scanner.nextInt();
        return result;
    }

    public int[] randomNumbers(int arrayLength, int minInteger, int maxInteger) {
        int[] result = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            Random r = new Random();
            int x = r.nextInt(maxInteger) + minInteger;
        }
        return result;
    }

    public List<String> readFromFile(String path, String separator) {
        List<String> textLines = new ArrayList<>();
        try {
            if (path != null) {
                scanner = new Scanner(new FileReader(path));
            }
            textLines = Files.readAllLines(Paths.get(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return textLines;
    }
}
