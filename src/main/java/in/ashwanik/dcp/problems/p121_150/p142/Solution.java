package in.ashwanik.dcp.problems.p121_150.p142;

class Solution {


    boolean isBalanced(String expression) {
        if (expression == null || expression.isEmpty()) {
            return true;
        }

        int count = 0;
        for (int index = 0; index < expression.length(); index++) {
            if (expression.charAt(index) == '(' || expression.charAt(index) == '*') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        if (count == 0) {
            return true;
        }
        count = 0;
        for (int index = expression.length() - 1; index >= 0; index--) {
            if (expression.charAt(index) == ')' || expression.charAt(index) == '*') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}