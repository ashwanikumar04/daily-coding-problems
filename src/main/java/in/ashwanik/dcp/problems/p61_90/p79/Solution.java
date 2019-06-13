package in.ashwanik.dcp.problems.p61_90.p79;

class Solution {

    boolean canBeSorted(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int p = -1;

        for (int index = 0; index < array.length - 1; index++) {
            if (array[index + 1] < array[index]) {
                if (p != -1) {
                    return false;
                }
                p = index;
            }
        }
        return (p == -1) || (p == 0) || (p == array.length - 2) || (array[p - 1] <= array[p + 1]) || (array[p] <= array[p + 2]);
    }
}