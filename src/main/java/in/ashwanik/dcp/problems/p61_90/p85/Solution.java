package in.ashwanik.dcp.problems.p61_90.p85;

class Solution {

    int get(int x, int y, int b) {
        return x * b + y * Math.abs(1 - b);
    }
}