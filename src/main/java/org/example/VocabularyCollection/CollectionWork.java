package org.example.VocabularyCollection;

import java.util.HashMap;

public class CollectionWork {
    public static HashMap<String, String> vcCollection = new HashMap<>();
    public static void setCollection(){
        String catW = new String ("кот");
        String catD = new String("усатый_полосатый_мяукающий_добряк");
        vcCollection.put(catW, catD);
    }

}
