package dataStructures;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        //HashMap does not keep insertion order
        Map<String, Integer> scoreTable = new HashMap<>();
        //LinkedHasMap keeps insertion order
        //Map<String,Integer>scoreTable = new LinkedHashMap<>();
        //TreeMap stores our elements by sorting Keys
        //Map<String, Integer> scoreTable = new TreeMap<>();
        scoreTable.put("Mary", 80);
        scoreTable.put("Adam", 100);
        scoreTable.put("John", 70);
        scoreTable.put("Alex", 90);
        scoreTable.put("Diana", 72);
        scoreTable.put("Mary", 100);
//        System.out.println("scoreTable = " + scoreTable);
//        System.out.println("scoreTable.get(\"Alex\") = " + scoreTable.get("Alex"));
//        scoreTable.remove("John");
//        System.out.println("John removed");
//        System.out.println("scoreTable = " + scoreTable);
//        scoreTable.replace("Adam",90);
//        System.out.println("scoreTable = " + scoreTable);
//        scoreTable.put(null, 100);
//        System.out.println("scoreTable = " + scoreTable);


        //Map views to iterate

//        Set<String> setOfKeys = scoreTable.keySet();
//        System.out.println("BEFORE REMOVING");
//        System.out.println("setOfKeys = " + setOfKeys);
//        System.out.println("scoreTable = " + scoreTable);
//        setOfKeys.remove("Alex");
//        System.out.println("AFTER REMOVING");
//        System.out.println("setOfKeys = " + setOfKeys);
//        System.out.println("scoreTable = " + scoreTable);


//        Collection<Integer> collectionOfValues = scoreTable.values();
//        System.out.println("collectionOfValues = " + collectionOfValues);
//        collectionOfValues.remove(100);
//        collectionOfValues.remove(100);
//        System.out.println("scoreTable = " + scoreTable);

        Set<Map.Entry<String, Integer>> setOfEntry = scoreTable.entrySet();
        for (Map.Entry<String, Integer> eachEntry : setOfEntry) {
            System.out.println("eachEntry = " + eachEntry);
            System.out.println("Key = " + eachEntry.getKey() + " | Value = " + eachEntry.getValue());
        }
    }
}
