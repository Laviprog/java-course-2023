package edu.hw1.task7;

public class CycleShift {
    public int rotateLeft(int n, int shift) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder resultBinaryStringBuilder = new StringBuilder();
        int len = binaryString.length();
        int newShift = shift % len;
        for (int i = 0; i < len; i++) {
            resultBinaryStringBuilder.append(binaryString.charAt((i + newShift) % len));
        }
        return Integer.parseInt(resultBinaryStringBuilder.toString(), 2);
    }

    public int rotateRight(int n, int shift) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder resultBinaryStringBuilder = new StringBuilder();
        int len = binaryString.length();
        int newShift = shift % len;
        for (int i = 0; i < len; ++i) {
            if (i - newShift < 0) {
                resultBinaryStringBuilder.append(binaryString.charAt(len + (i - newShift)));
            } else {
                resultBinaryStringBuilder.append(binaryString.charAt(i - newShift));
            }
        }
        return Integer.parseInt(resultBinaryStringBuilder.toString(), 2);
    }
}
