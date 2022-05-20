package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class WriteSymptomDataIntoFile implements IWritingSymptoms {
    private TreeMap<String, Integer> symptomsResult;

    private String filepath;

    public WriteSymptomDataIntoFile(TreeMap<String, Integer> symptomsResult, String filepath) {
        this.symptomsResult = symptomsResult;
        this.filepath = filepath;
    }

    /**
     * Write the count of each symptom in the file "result.out"
     *
     * @return "result.out"
     * @throws IOException / Catches exception if  error in Input/Output
     */

    public void writeSymptoms() {

        if (filepath != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
                String result = symptomsResult.entrySet()
                        .stream()
                        .map(e -> String.format("%s = %d ", e.getKey(), e.getValue()) + "\n")
                        .collect(Collectors.joining());
                writer.write(result);
                System.out.println(result);
            } catch (IOException e) {
                System.err.println("Error writing to file" + e.getMessage());
            }
        }


    }


}
