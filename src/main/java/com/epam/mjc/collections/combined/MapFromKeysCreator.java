package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for(String s : sourceMap.keySet()) {
            int len = s.length();
            if (!result.containsKey(len)) {
                HashSet<String> values = new HashSet<>();
                values.add(s);
                result.put(len, values);
                continue;
            }
            result.get(len).add(s);
        }
        return result;
    }
}
