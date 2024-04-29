package edu.hw1.task6;

import edu.hw1.task2.CountDigit;
import java.util.Arrays;

@SuppressWarnings({"MagicNumber", "ParameterAssignment"})
public class Kaprekar {
    private static final int KAPREKAR_CONSTANT = 6174;
    private static final CountDigit COUNT_DIGIT = new CountDigit();

    private int[] numberToArray(int number) {
        int[] array = new int[COUNT_DIGIT.countDigit(number)];
        int iterator = COUNT_DIGIT.countDigit(number) - 1;
        while (number > 0) {
            array[iterator--] = number % 10;
            number /= 10;
        }
        return array;
    }

    private int arrayToNumber(int[] array) {
        int numberResult = 0;
        for (int i = array.length - 1, stp = 1; i > -1; i--, stp *= 10) {
            numberResult += stp * array[i];
        }
        return numberResult;
    }

    private int[] arraySortedAscending(int[] array) {
        Arrays.sort(array);
        return array;
    }

    private int[] arraySortedDescending(int[] array) {
        Arrays.sort(array);
        int[] arrayReversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayReversed[i] = array[array.length - i - 1];
        }
        return arrayReversed;
    }

    private int changeNumber(int number) {
        return arrayToNumber(arraySortedDescending(numberToArray(number)))
                - arrayToNumber(arraySortedAscending(numberToArray(number)));
    }

    public int countK(int number) {
        return number == KAPREKAR_CONSTANT ? 0 : countK(changeNumber(number)) + 1;
    }
}

