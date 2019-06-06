package in.ashwanik.dcp.problems.p31_60.p51;

import java.util.Random;

class Solution {

    private Random random;

    public Solution() {
        random = new Random();
    }

    void shuffle(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        for (int index = array.length - 1; index > 0; index--) {
            int current = random.nextInt(index + 1);
            int temp = array[index];
            array[index] = array[current];
            array[current] = temp;
        }
    }
}


