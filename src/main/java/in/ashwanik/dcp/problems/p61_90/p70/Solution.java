package in.ashwanik.dcp.problems.p61_90.p70;

class Solution {

    int perfectNumber(int n) {
        int count = 0;
        for (int index = 19; ; index += 9) {

            int current = index;
            int sum = 0;
            while (current > 0) {
                sum += current % 10;
                current = current / 10;
            }

            if (sum == 10) {
                count++;
            }
            if (count == n) {
                return index;

            }
        }
    }
}
