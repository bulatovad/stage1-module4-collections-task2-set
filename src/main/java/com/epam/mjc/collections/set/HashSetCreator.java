package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i: sourceList) {
            if(i%2==0) {
                int x = i;
                while (x%2==0){
                    hs.add(x);
                    x /= 2;
                }
                hs.add(x);
            } else {
                hs.add(i);
                hs.add(i*2);
            }
        }
        return hs;
    }
}
