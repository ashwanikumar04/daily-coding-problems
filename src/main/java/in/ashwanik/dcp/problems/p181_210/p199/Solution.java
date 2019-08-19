package in.ashwanik.dcp.problems.p181_210.p199;

class Solution {

    String getBalancedParentheses(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }


        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                count++;
                stringBuilder.append(c);
            } else {
                if (count <= 0) {
                    stringBuilder.append('(');
                } else {
                    count--;
                }
                stringBuilder.append(c);
            }
        }

        while (count > 0) {
            stringBuilder.append(')');
            count--;
        }

        return stringBuilder.toString();
    }
}