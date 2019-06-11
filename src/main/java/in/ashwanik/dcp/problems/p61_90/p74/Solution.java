package in.ashwanik.dcp.problems.p61_90.p74;

class Solution {
    int findCount(int n, int x) {
        int count = 0;
        for (int index = 1; index <= n; index++) {
            if (index > x) {
                break;
            }
            if (x % index == 0 && x / index <= n) {
                count++;
            }
        }
        return count;
    }
}
