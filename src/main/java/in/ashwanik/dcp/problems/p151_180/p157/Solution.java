package in.ashwanik.dcp.problems.p151_180.p157;

class Solution {

    boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int[] array = new int[256];
        for (char c : str.toCharArray()) {
            array[c] = array[c] + 1;
        }
        boolean isOddCountFound = false;
        for (int i : array) {
            if ((i & 1) == 1) {
                if (isOddCountFound) {
                    return false;
                } else {
                    isOddCountFound = true;
                }
            }
        }
        return true;
    }
}