package in.ashwanik.dcp.problems.p30;

class Solution {


    int calculateTrappedWater(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        while (left < right) {
            if (leftMax < array[left]) {
                leftMax = array[left];
            }
            if (rightMax < array[right]) {
                rightMax = array[right];
            }
            if (leftMax < rightMax) {
                water += Math.max(0, leftMax - array[left]);
                left++;
            } else {
                water += Math.max(0, rightMax - array[right]);
                right--;
            }
        }
        return water;
    }
}


