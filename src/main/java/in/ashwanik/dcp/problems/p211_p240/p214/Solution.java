package in.ashwanik.dcp.problems.p211_p240.p214;

class Solution {

    int lengthOf1s(int number) {
        String binary = Integer.toBinaryString(number);
        int max = 0;

        int current = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                current++;
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        return max;
    }
}