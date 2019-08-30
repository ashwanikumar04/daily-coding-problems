package in.ashwanik.dcp.problems.p211_p240.p212;

class Solution {

    String getExcelColumn(int number) {
        StringBuilder column = new StringBuilder();
        int current = number;

        while (current > 0) {
            int rem = current % 26;
            if (rem == 0) {
                column.append("Z");
                current = (current / 26) - 1;
            } else {
                column.append((char) ((rem - 1) + 'A'));
                current = current / 26;
            }
        }
        return column.reverse().toString();
    }
}