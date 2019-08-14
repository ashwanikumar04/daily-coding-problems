package in.ashwanik.dcp.problems.p181_210.p195;

class Solution {
    int countNumbers(int[][] array, int[] i, int[] j) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int iNum = array[i[0]][i[1]];
        int jNum = array[j[0]][j[1]];


        int count = 0;
        for (int[] row : array) {
            count = count + findSmaller(row, iNum) + (row.length - findSmaller(row, jNum));
        }
        return count;

    }

    //1, 3, 7, 10, 15, 20
    private int findSmaller(int[] array, int number) {

        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] < number) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;

    }
}