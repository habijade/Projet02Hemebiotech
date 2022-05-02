package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class WriteSymptomDataIntoFile implements IWritingSymptoms {
    private TreeMap<String, Integer> symptomsResult;

    public WriteSymptomDataIntoFile(TreeMap<String, Integer> symptomsResult){
        this.symptomsResult = symptomsResult;
    }

    /**
     * Write the count of each symptom in the file "result.out"
     * @return "result.out"
     * @throws IOException / Catches exception if  error in Input/Output
     */

    public void writeSymptoms(){
        FileWriter writer = null;
        if(symptomsResult != null || !symptomsResult.isEmpty()){
            try {
                writer = new FileWriter("Project02Eclipse/result.out");
                final FileWriter filewriter = writer;
                symptomsResult.entrySet().stream().forEach (entry -> {
                    System.out.println(entry.getKey() + " = "+ entry.getValue());
                    try {
                        filewriter.write(entry.getKey() + " = "+ entry.getValue() + ("\n"));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

            }catch (IOException e){
                System.err.println(" Erreur lors de l'ecriture dans le fichier " + e.getMessage());
            }finally {
                if (writer != null){
                    try{
                        writer.close();
                    } catch (IOException e){
                        System.err.println(" Error lors de l'ecriture dans le fichier " + e.getMessage());
                    }
                }
            }
        }

    }



}
