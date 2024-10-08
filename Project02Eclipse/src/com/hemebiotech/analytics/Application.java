package com.hemebiotech.analytics;


import java.util.List;
import java.util.TreeMap;

public class Application {


    public static void main(String args[]) {

        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        List<String> symptoms = reader.getSymptoms();

        AnalyticCounter analyticCounter = new AnalyticCounter(symptoms);
        TreeMap<String, Integer> result = analyticCounter.countSymptoms();

        WriteSymptomDataIntoFile writeSymptoms = new WriteSymptomDataIntoFile(result, "Project02Eclipse/result.out");
        writeSymptoms.writeSymptoms();


    }
}
