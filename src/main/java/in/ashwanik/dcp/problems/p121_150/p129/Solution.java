package in.ashwanik.dcp.problems.p121_150.p129;

class Solution {

    int sqrt(int number) {

        if (number <= 0) {
            return 0;
        }
        int answer = 0;
        int start = 0;
        int end = number;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sqr = mid * mid;
            if (sqr == number) {
                return mid;
            }
            if (sqr < number) {
                start = mid + 1;
                answer = mid;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}