package edu.hw1.task2;

@SuppressWarnings({"MagicNumber", "ParameterAssignment"})
public class CountDigit {

    public int countDigit(int num) {
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num > 0);
        return count;
    }

}
