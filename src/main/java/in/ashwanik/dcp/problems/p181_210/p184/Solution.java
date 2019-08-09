package in.ashwanik.dcp.problems.p181_210.p184;

class Solution {


    int gcd(int[] array) {
        if (array == null || array.length == 0) {
            return 1;
        }

        int result = array[0];

        for (int index = 1; index < array.length; index++) {
            result = gcd(array[index], result);
        }
        return result;
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}