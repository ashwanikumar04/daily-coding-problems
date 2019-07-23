package in.ashwanik.dcp.problems.p151_180.p153;

class Solution {

    int minimumDistanceBetweenWords(String text, String word1, String word2) {
        if (text == null || word1 == null || word2 == null) {
            return -1;
        }

        if (word1.equals(word2)) {
            return 0;
        }

        String[] words = text.split(" ");

        int m = -1;
        int n = -1;
        int minimumDistance = words.length + 1;
        for (int index = 0; index < words.length; index++) {

            if (words[index].equals(word1)) {
                m = index;
            } else if (words[index].equals(word2)) {
                n = index;
            }

            if (m != -1 && n != -1) {

                minimumDistance = Math.min(minimumDistance, Math.abs(m - n));
            }
        }
        return minimumDistance;
    }
}