package org.example.Commands;

import org.example.VocabularyCollection.CollectionWork;

import java.util.Scanner;

public class Search {
    public static void searchDefinition(){
        System.out.println("введите слово, определение которого вы ищете");
        Scanner scanner = new Scanner(System.in);
        String wordKey =  scanner.nextLine();
        if (CollectionWork.vcCollection.get(wordKey) != null) {
            System.out.println("определение слова: " + CollectionWork.vcCollection.get(wordKey));
        } else {
            System.out.println("такого слова нет");
        }
    }
}
