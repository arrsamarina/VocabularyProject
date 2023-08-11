package org.example;

import org.example.Commands.CommandProcessing;
import org.example.Commands.Help;
import org.example.VocabularyCollection.CollectionWork;

public class Main {
    public static void main(String[] args){
        CollectionWork.setCollection();
        Help.helpExecute();
        CommandProcessing.commandScanner();
    }
}