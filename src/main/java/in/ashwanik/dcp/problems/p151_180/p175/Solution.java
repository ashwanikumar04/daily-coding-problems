package in.ashwanik.dcp.problems.p151_180.p175;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    ///https://medium.com/@__amol__/markov-chains-with-python-1109663f3678
    Map<String, Integer> getMarkovChain(List<State> statesList, int numberOfIterations, String startState) {
        Map<String, Integer> result = new HashMap<>();
        if (statesList == null || statesList.isEmpty()) {
            return result;
        }

        Map<String, List<State>> stateMap = new HashMap<>();

        for (State state : statesList) {
            stateMap.putIfAbsent(state.from, new ArrayList<>());
            stateMap.get(state.from).add(state);
        }
        String currentState = startState;
        for (int iteration = 0; iteration < numberOfIterations; iteration++) {
            State state = getRandom(stateMap.get(currentState));
            currentState = state.to;
            result.put(currentState, result.getOrDefault(currentState, 0) + 1);
        }
        return result;
    }


    private State getRandom(List<State> transitions) {
        double prob = Math.random();
        double cumulativeProb = 0.0;
        for (State state : transitions) {
            cumulativeProb += state.prob;
            if (prob <= cumulativeProb) {
                return state;
            }
        }
        return null;
    }


    static class State {
        private String from;
        private String to;
        private float prob;

        public State(String from, String to, float prob) {
            this.from = from;
            this.to = to;
            this.prob = prob;
        }
    }
}