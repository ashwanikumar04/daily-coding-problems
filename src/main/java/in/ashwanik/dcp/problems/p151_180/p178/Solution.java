package in.ashwanik.dcp.problems.p151_180.p178;

import java.util.Random;

class Solution {
    private Random random;

    Solution() {
        random = new Random();
    }

    private int dice() {
        return random.nextInt(6) + 1;
    }

    int numberOfDiceToWin(int a, int b) {
        int diceThrown = 1;
        int current = dice();
        while (true) {
            int next = dice();
            diceThrown++;
            if (current == a && next == b) {
                return diceThrown;
            }
            current = next;
        }
    }
}