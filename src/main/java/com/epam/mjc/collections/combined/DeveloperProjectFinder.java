package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devProjects = new ArrayList<>();
        for(Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) devProjects.add(e.getKey());
        }
        Collections.sort(devProjects, (s1, s2) -> s2.length() - s1.length());
        return devProjects;
    }
}
