package in.ashwanik.dcp.problems.p31_60.p50;

import in.ashwanik.dcp.common.TreeNode;

import java.util.List;
import java.util.Stack;

class Solution {

    int evaluate(TreeNode<String> root) {
        if (root == null) {
            return -1;
        }
        int result = 0;
        List<String> postOrder = root.postorder();
        Stack<Integer> stack = new Stack<>();

        for (String token : postOrder) {
            if (isOperator(token)) {
                Integer operand1 = stack.pop();
                Integer operand2 = stack.pop();
                int current = 0;
                switch (token) {
                    case "+":
                        current = operand1 + operand2;
                        break;
                    case "-":
                        current = operand1 - operand2;
                        break;
                    case "*":
                        current = operand1 * operand2;
                        break;
                    case "/":
                        current = operand1 / operand2;
                        break;
                }
                stack.push(current);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}


