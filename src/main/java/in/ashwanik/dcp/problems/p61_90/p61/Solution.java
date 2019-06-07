package in.ashwanik.dcp.problems.p61_90.p61;

class Solution {

    long power(int x, int n) {

        if (n == 0) {
            return 1;
        }

        long temp = power(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }
}


