package in.ashwanik.dcp.problems.p1_30.p29;

class Solution {

    String encode(String text) {
        if (text == null || text.isEmpty() || text.length() == 1) {
            return text;
        }
        int encodedLength = getEncodedLength(text);
        if (encodedLength >= text.length()) {
            return text;
        }
        String encoded = "";
        int current = 0;
        char currentChar = text.charAt(0);
        for (int index = 1; index < text.length(); index++) {
            if (currentChar == text.charAt(index)) {
                current++;
            } else {
                encoded = encoded + (current + 1) + currentChar;
                currentChar = text.charAt(index);
                current = 0;
            }
        }
        encoded = encoded + (current + 1) + currentChar;
        return encoded;
    }

    private int getEncodedLength(String text) {
        int count = 0;
        int current = 0;
        char currentChar = text.charAt(0);
        for (int index = 1; index < text.length(); index++) {
            if (currentChar == text.charAt(index)) {
                current++;
            } else {
                count = count + Integer.toString(current + 1).length() + 1;
                currentChar = text.charAt(index);
                current = 0;
            }
        }
        count = count + Integer.toString(current + 1).length() + 1;
        return count;
    }
}


