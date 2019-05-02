package in.ashwanik.dcp.problems.p12;

class Solution {

    int numberOfWaysToClimb(int numberOfStairs) {
        if (numberOfStairs == 0) {
            return 0;
        }
        if (numberOfStairs == 1) {
            return 1;
        }
        if (numberOfStairs == 2) {
            return 2;
        }
        int a = 1;
        int b = 2;
        int c = a + b;
        for (int index = 3; index <= numberOfStairs; index++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}


