package in.ashwanik.dcp.problems.p1_30.p15;

import java.util.Random;

class Solution {

    private Random random;
    private int res = 0;
    private int count = 0;

    Solution() {
        random = new Random();
    }

    int getRandom(int x) {
        count++;
        if (count == 1) {
            res = x;
        } else {
            int i = random.nextInt(count);
            if (i == count - 1) {
                res = x;
            }
        }
        return res;
    }
}


