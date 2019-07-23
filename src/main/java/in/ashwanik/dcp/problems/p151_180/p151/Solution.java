package in.ashwanik.dcp.problems.p151_180.p151;

import java.util.HashSet;
import java.util.Set;

class Solution {
    private int[] rows = {1, 1, 0, -1, -1, -1, 0, 1};
    private int[] columns = {0, 1, 1, 1, 0, -1, -1, -1};

    void replaceColor(char[][] image, int[] cell, char color) {
        if (image == null || image.length == 0) {
            return;
        }
        Set<String> visited = new HashSet<>();
        char colorToBeReplaced = image[cell[0]][cell[1]];
        changeColor(image, cell[0], cell[1], color, visited, colorToBeReplaced);
    }

    private void changeColor(char[][] image, int row, int column, char color, Set<String> visited, char colorToBeReplaced) {
        image[row][column] = color;
        visited.add(row + "," + column);
        for (int index = 0; index < 8; index++) {
            if (isSafeToChangeColor(image, row + rows[index], column + columns[index], visited, colorToBeReplaced)) {
                changeColor(image, row + rows[index], column + columns[index], color, visited, colorToBeReplaced);
            }
        }
    }

    private boolean isSafeToChangeColor(char[][] image, int row, int column, Set<String> visited, char colorToBeReplaced) {
        return (row >= 0 && row < image.length)
                && (column >= 0 && column < image[0].length)
                && !visited.contains(row + "," + column)
                && image[row][column] == colorToBeReplaced;
    }
}