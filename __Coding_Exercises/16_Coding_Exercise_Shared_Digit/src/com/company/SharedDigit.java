package com.company;

public class SharedDigit {

    public static void main(String[] args) {
        hasSharedDigit(10, 99);
        hasSharedDigit(9, 99);
        hasSharedDigit(19, 99);
        hasSharedDigit(12, 13);
    }

    public static boolean hasSharedDigit(int start, int end) {
        if ((start < 10 || start > 99) || (end < 10 || end > 99)) {
            return false;
        }

        int firstDigitStart = 0;
        int secondDigitStart = 0;
        int firstDigitEnd = 0;
        int secondDigitEnd = 0;
        int firstCount = 0;
        int secondCount = 0;
        while (start > 0) {
            firstCount++;
            if (firstCount == 1) {
                firstDigitStart = start % 10;
            }
            if (firstCount == 2) {
                secondDigitStart = start % 10;
            }
            start /= 10;
        }

        while (end > 0) {
            secondCount++;
            if (secondCount == 1) {
                firstDigitEnd = end % 10;
            }
            if (secondCount == 2) {
                secondDigitEnd = end % 10;

            }
            if (firstDigitStart == firstDigitEnd
                    || firstDigitStart == secondDigitEnd
                    || secondDigitStart == secondDigitEnd) {
                return true;
            }
            end /= 10;
        }
        return false;
    }

}

