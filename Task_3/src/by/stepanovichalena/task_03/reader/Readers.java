package by.stepanovichalena.task_03.reader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Readers {

    private Scanner scanner;

    public int readIntFromConsole() {
        scanner = new Scanner(System.in);
        int result;
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        result = scanner.nextInt();
        return result;
    }

    public String readStringFromConsole() {
        scanner = new Scanner(System.in);
        String result = "";
        while (!scanner.hasNext()) {
            result = scanner.nextLine();
        }
        return result;
    }

    public String readStringFromFile(String path) {
        StringBuilder result = new StringBuilder();
        try {
            if (path != null) {
                scanner = new Scanner(new FileReader(path));
            }
            while (scanner.hasNext()) {
                result.append(scanner.nextLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }


    public List<String> readLinesFromFile(String path) {
        List<String> textLines = new ArrayList<>();
        try {
            if (path != null) {
                textLines = Files.readAllLines(Paths.get(path));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textLines;
    }

    public static void main(String[] args) {
        Readers readers = new Readers();
        System.out.println(readers.readStringFromFile("C:/Users/user/Desktop/ew.txt"));
    }
}
