package in.ashwanik.dcp.problems.p211_p240.p213;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> generatePossibleIps(String input) {
        List<String> ips = new ArrayList<>();
        int[] path = new int[4];
        breakIp(input, ips, path, 0, 0);
        return ips;
    }

    private void breakIp(String input, List<String> ips, int[] path, int breakIndex, int segment) {
        if (segment == 4 && breakIndex == input.length()) {
            ips.add(path[0] + "." + path[1] + "." + path[2] + "." + path[3]);
            return;
        }
        if (segment == 4 || breakIndex == input.length()) {
            return;
        }

        for (int length = 1; length <= 3; length++) {
            String part = input.substring(breakIndex, breakIndex + length);
            int number = Integer.parseInt(part);
            if (!isValidPart(part, number)) {
                break;
            }
            path[segment] = number;

            breakIp(input, ips, path, breakIndex + length, segment + 1);
            path[segment] = -1;

        }
    }

    private boolean isValidPart(String part, int number) {
        if (number < 0 || number > 255) {
            return false;
        }
        if (part.length() > 1 && number == 0) {
            return false;
        }
        if (part.length() > 1 && part.charAt(0) == '0') {
            return false;
        }
        return true;
    }
}