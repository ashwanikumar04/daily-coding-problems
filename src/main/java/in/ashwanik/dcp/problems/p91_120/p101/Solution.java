package in.ashwanik.dcp.problems.p91_120.p101;

class Solution {
    int[] findPrimeSumPair(int number) {

        if (number % 2 == 1) {
            return new int[0];
        }

        int[] pair = new int[2];

        boolean[] primeNumbers = getPrimeNumbers(number);
        for (int index = 0; index < number; index++) {
            if (primeNumbers[index] && primeNumbers[number - index]) {
                pair[0] = index;
                pair[1] = number - index;
                break;
            }
        }

        return pair;
    }

    private boolean[] getPrimeNumbers(int number) {
        boolean[] primeNumbers = new boolean[number + 1];
        primeNumbers[0] = false;
        primeNumbers[1] = false;

        for (int index = 2; index <= number; index++) {
            primeNumbers[index] = true;
        }

        for (int index = 2; index * index <= number; index++) {
            if (primeNumbers[index]) {
                for (int j = index * index; j <= number; j += index) {
                    primeNumbers[j] = false;
                }
            }
        }
        return primeNumbers;
    }
}