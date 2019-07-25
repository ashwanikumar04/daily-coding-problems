package in.ashwanik.dcp.problems.p151_180.p164;

class Solution {

    int getDuplicateNumber(int[] array, int n) {
        int xor = 0;

        for (int number : array) {
            xor = xor ^ number;
        }

        for (int index = 1; index <= n; index++) {
            xor = xor ^ index;
        }
        return xor;
    }
}