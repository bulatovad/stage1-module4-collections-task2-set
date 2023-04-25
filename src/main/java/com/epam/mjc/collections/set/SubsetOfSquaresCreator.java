package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squares = new TreeSet<>();
        for(int i: sourceList) {
            squares.add((int)Math.pow(i,2));
        }
        return squares.subSet(lowerBound, upperBound+1);
    }
}
