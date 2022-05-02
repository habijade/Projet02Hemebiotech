package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticCounter {
    private List<String> symptoms;

    public AnalyticCounter(List<String> symptoms){
        this.symptoms = symptoms;
    }
    /**
     *Sort and count occurences of each symptom with iteration
     * @return map of symptoms/occurences
     */
    public TreeMap<String, Integer> countSymptoms(){
        TreeMap<String, Integer> treeSymptoms = new TreeMap<String, Integer>();
        for (String symptoms : symptoms){

            if (treeSymptoms.containsKey(symptoms)){
                treeSymptoms.put(symptoms, treeSymptoms.get(symptoms)+1 );
            } else {
                treeSymptoms.put(symptoms, 1);
            }
        }

        return treeSymptoms;
    }


}
