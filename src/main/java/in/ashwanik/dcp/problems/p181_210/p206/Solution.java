package in.ashwanik.dcp.problems.p181_210.p206;

class Solution {

    //a b c
    //2 1 0

    void permuteArray(char[] array, int[] indices) {
        if (array == null || indices == null) {
            return;
        }
        for (int index = 0; index < array.length; index++) {
            int temp = indices[index];
            indices[index] = indices[temp];
            indices[temp] = temp;

            int k = array[index] - 'a';
            array[index] = array[temp];
            array[temp] = array[k];
        }
    }
}