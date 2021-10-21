package by.stepanovichalena.task_03.task0301.view;

import by.stepanovichalena.task_03.exception.Task03Exception;
import by.stepanovichalena.task_03.task0301.logic.*;
import by.stepanovichalena.task_03.parser.ValuesFromArray;
import by.stepanovichalena.task_03.task0301.randomnumbers.RandomNumbersArray;
import by.stepanovichalena.task_03.reader.Readers;

import java.util.Arrays;

public class ViewTask0301 {
    public static void main(String[] args) throws Task03Exception {
        RandomNumbersArray randomNumbersArray = new RandomNumbersArray();
        Readers readers = new Readers();
        ValuesFromArray valuesFromArray = new ValuesFromArray();

        System.out.println("Creating random values");
        int [] array = randomNumbersArray.randomNumbersArray(20, 0, 1236);


        System.out.println("Reading values from file");
        int [] numbersFromFile = valuesFromArray.digitsFromArray(readers.readLinesFromFile("data/numbers.txt"), ",");
        System.out.println(Arrays.toString(numbersFromFile));

        System.out.println("Reading from console");
        System.out.println("Input the size of array");
        int size = readers.readIntFromConsole();
        while (size <= 0){
            size = readers.readIntFromConsole();
        }
        int [] numbersFromConsole = new int[size];
        int entity = size;
        for (int i = 0; i < size; i++){
            System.out.println(entity-- +" values left to enter");
            numbersFromConsole[i] = readers.readIntFromConsole();
        }
        System.out.println(Arrays.toString(numbersFromConsole));

        System.out.println("\nSorting arrays in three ways"+"\n");
        SortArrays sortArrays = new SortArrays();

        System.out.println("Bubble sort random array");
        sortArrays.bubbleSort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("\nShuttle sort array from file");
        sortArrays.shuttleSort(numbersFromFile);
        System.out.println(Arrays.toString(numbersFromFile));


        System.out.println("\nInsertion sort array from console");
        sortArrays.insertionSort(numbersFromConsole);
        System.out.println(Arrays.toString(numbersFromConsole));

        System.out.println("\nBinary search for element in array ");
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Array to search for "+Arrays.toString(numbersFromFile));
        System.out.println(binarySearch.searchIteratively(numbersFromFile, -45));

        System.out.println("\nFinding the maximum and minimum elements of the array");
        MinAndMaxValue minAndMaxValue = new MinAndMaxValue();
        System.out.println("Min value "+minAndMaxValue.minValue(numbersFromFile) +" max value "+ minAndMaxValue.maxValue(numbersFromFile));

        System.out.println("\nAll prime numbers in the array");
        AllPrimeNumbers allPrimeNumbers = new AllPrimeNumbers();
        System.out.println(Arrays.toString(allPrimeNumbers.allPrimeNumbers(array)));

        System.out.println("\nAll the Fibonacci numbers in the array");
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(Arrays.toString(fibonacciNumbers.findFibonacciNumbers(numbersFromFile)));

        System.out.println("\nAll three-digit numbers with no identical digits in the decimal notation");
        DifferentThreeDigitNumbers differentThreeDigitNumbers = new DifferentThreeDigitNumbers();
        System.out.println(Arrays.toString(differentThreeDigitNumbers.findThreeDifferentDigits(numbersFromFile)));

    }
}
