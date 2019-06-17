package in.ashwanik.dcp.problems.p61_90.p90;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Solution {

    private int size;
    private Map<Integer, Integer> map;
    private Random random;

    public Solution(int N, int[] blacklist) {

        map = new HashMap<>();
        for (int n : blacklist) {
            map.put(n, -1);
        }
        size = N - map.size();

        for (int n : blacklist) {
            if (n < size) {
                while (map.containsKey(N - 1)) {
                    N--;
                }
                map.put(n, N - 1);
                N--;
            }
        }
        random = new Random();
    }

    public int pick() {
        int r = random.nextInt(size);
        if (map.containsKey(r)) {
            return map.get(r);
        }
        return r;
    }
}