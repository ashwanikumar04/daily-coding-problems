package in.ashwanik.dcp.problems.p181_210.p202;

class Solution {


    ///1234
    boolean isPalindrom(int number) {
        if (number == 0) {
            return true;
        }

        int reverse = 0;

        int n = number;
        int mod = 0;
        while (n > 0) {
            mod = n % 10;
            reverse = reverse * 10 + mod;
            n = n / 10;
        }
        return number == reverse;
    }
}