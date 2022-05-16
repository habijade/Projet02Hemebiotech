package com.hemebiotech.analytics;

import java.util.List;

import java.util.TreeMap;

public class AnalyticCounter {
    private List<String> symptoms;

    public AnalyticCounter(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * Sort and count occurences of each symptom with iteration
     *
     * @return map of symptoms/occurences
     */
    public TreeMap<String, Integer> countSymptoms() {
        TreeMap<String, Integer> treeSymptoms = new TreeMap<>();

        for (String symptom : symptoms) {

            if (treeSymptoms.containsKey(symptom)) {
                treeSymptoms.put(symptom, treeSymptoms.get(symptom) + 1);
            } else {
                treeSymptoms.put(symptom, 1);
            }

        }

        return treeSymptoms;
    }
}



