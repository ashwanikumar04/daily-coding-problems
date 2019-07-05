package in.ashwanik.dcp.problems.p91_120.p120;

class Solution {

    private static boolean isOddCall;
    private static Solution instance1;
    private static Solution instance2;
    private boolean isOdd;

    private Solution(boolean isOdd) {
        this.isOdd = isOdd;
    }

    static Solution getInstance() {
        if (isOddCall) {
            if (instance2 == null) {
                instance2 = new Solution(isOddCall);
            }
            isOddCall = false;
            return instance2;
        } else {
            if (instance1 == null) {
                instance1 = new Solution(isOddCall);
            }
            isOddCall = true;
            return instance1;
        }

    }

    public boolean isOdd() {
        return isOdd;
    }

}