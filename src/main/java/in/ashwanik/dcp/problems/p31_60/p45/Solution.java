package in.ashwanik.dcp.problems.p31_60.p45;

import java.util.Random;

class Solution {


    int rand7() {
        while (true) {
            int number = 5 * rand5() + rand5() - 5;
            if (number < 22) {
                return (number % 7) + 1;
            }
        }
    }

   private int rand5() {
        return new Random().nextInt(5);
    }
}


