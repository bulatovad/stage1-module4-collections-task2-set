package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> s = new HashSet<>();

        for(String fs:firstSet) {
            if(secondSet.contains(fs) && !thirdSet.contains(fs))
                s.add(fs);
        }

        for(String ts:thirdSet) {
            if(!firstSet.contains(ts) && !secondSet.contains(ts))
                s.add(ts);
        }
        return s;
    }
}
