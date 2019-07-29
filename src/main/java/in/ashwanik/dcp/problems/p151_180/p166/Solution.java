package in.ashwanik.dcp.problems.p151_180.p166;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Solution {
    private int[][] array;

    Solution(int[][] array) {
        this.array = array;
    }

    Iterator<Integer> iterator() {
        return new ArrayIterator(this.array);
    }

    private static class ArrayIterator implements Iterator<Integer> {
        int[][] array;
        int row;
        int column;

        ArrayIterator(int[][] array) {
            this.array = array;
            this.row = 0;
            this.column = 0;
        }

        @Override
        public boolean hasNext() {
            if (row < array.length && column >= array[row].length) {
                row++;
                column = 0;
            }
            while (row < array.length && array[row].length == 0) {
                row++;
                column = 0;
            }
            return row < array.length && column < array[row].length;
        }

        @Override
        public Integer next() {
            if ((row >= array.length) || (column >= array[row].length)) {
                throw new NoSuchElementException("No more item");
            }
            if (hasNext()) {
                return array[row][column++];
            }
            throw new NoSuchElementException("No more item");
        }
    }
}