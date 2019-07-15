package in.ashwanik.dcp.problems.p121_150.p128;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> towerOfHanoi(int numberOfDisks) {
        List<String> moves = new ArrayList<>();
        calculateMoves(numberOfDisks, "1", "3", "2", moves);
        return moves;
    }

    private void calculateMoves(int numberOfDisks, String source, String destination, String temporary, List<String> moves) {
        if (numberOfDisks == 1) {
            moves.add("Move " + source + " to " + destination);
            return;
        }

        calculateMoves(numberOfDisks - 1, source, temporary, destination, moves);
        moves.add("Move " + source + " to " + destination);
        calculateMoves(numberOfDisks - 1, temporary, destination, source, moves);
    }
}