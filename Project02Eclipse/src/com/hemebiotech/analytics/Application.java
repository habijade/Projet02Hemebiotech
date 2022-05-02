package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.TreeMap;

public class Application {

	
	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();

		AnalyticCounter analyticCounter = new AnalyticCounter(symptoms);
		TreeMap<String, Integer> result = analyticCounter.countSymptoms();

		

	}
}
