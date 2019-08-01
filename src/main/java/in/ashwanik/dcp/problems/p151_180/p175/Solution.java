package in.ashwanik.dcp.problems.p151_180.p175;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    ///https://www.datacamp.com/community/tutorials/markov-chains-python-tutorial
    Map<String, Integer> getMarkovChain(List<State> statesList, int numberOfIterations, String startState) {
        Map<String, Integer> result = new HashMap<>();
        if (statesList == null || statesList.isEmpty()) {
            return result;
        }

        Set<String> statesSet = new LinkedHashSet<>();

        for (State state : statesList) {
            statesSet.add(state.from);
        }

        List<String> states = new ArrayList<>(statesSet);

        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        int startIndex = 0;
        for (int index = 0; index < states.size(); index++) {
            List<Integer> list = new ArrayList<>();
            int current = 0;
            while (current < states.size()) {
                list.add(startIndex++);
                current++;
            }
            indicesMap.put(index, list);
        }

        String currentState = startState;
        float startProbability = 1;

        for (int iteration = 0; iteration < numberOfIterations; iteration++) {
            int stateIndex = states.indexOf(currentState);
            State state = getRandom(statesList, indicesMap.get(stateIndex));
            startProbability = startProbability * state.prob;
            currentState = state.to;
            result.put(currentState, result.getOrDefault(currentState, 0) + 1);
        }
        return result;
    }


    private State getRandom(List<State> stateList, List<Integer> indices) {
        double prob = Math.random();
        double cumulativeProb = 0.0;
        for (int index : indices) {
            cumulativeProb += stateList.get(index).prob;
            if (prob <= cumulativeProb) {
                return stateList.get(index);
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

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public float getProb() {
            return prob;
        }
    }
}