package in.ashwanik.dcp.problems.p61_90.p88;

class Solution {

    int divideWithoutDivision(int dividend, int divisor) {
        int sign;
        if (dividend < 0 && divisor < 0) {
            sign = 1;
        } else if (dividend < 0 || divisor < 0) {
            sign = -1;
        } else {
            sign = 1;
        }
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);
        int count = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            count++;
        }
        return count * sign;
    }
}