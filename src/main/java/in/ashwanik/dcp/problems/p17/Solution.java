package in.ashwanik.dcp.problems.p17;

class Solution {

    int maxAbsoluteFilePathLength(String fullPath) {
        if (fullPath == null || fullPath.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        String[] splits = fullPath.split("\n");
        int[] level = new int[splits.length];
        for (String part : splits) {
            String levelText = part.replaceAll("\t*", "");
            int currentLevel = part.length() - levelText.length();
            if (levelText.contains(".")) {
                maxLength = Math.max(maxLength, (currentLevel > 0 ? level[currentLevel - 1] : 0) + levelText.length());

            } else {
                level[currentLevel] = (currentLevel > 0 ? level[currentLevel - 1] : 0) + levelText.length() + 1;
            }
        }
        return maxLength;
    }
}


