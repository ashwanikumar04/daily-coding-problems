package in.ashwanik.dcp.problems.p61_90.p66;

import java.util.Random;

class Solution {

    private Random random = new Random();

    private boolean tossBiased() {
        float leftLimit = 0F;
        float rightLimit = 1F;
        float value = leftLimit + random.nextFloat() * (rightLimit - leftLimit);
        return value < .6F;
    }

    boolean fairCoin() {
        boolean a;
        boolean b;
        do {
            a = tossBiased();
            b = tossBiased();
        } while (a == b);
        return a;
    }
}


