package org.example.Commands;

import org.example.VocabularyCollection.CollectionWork;

import java.util.Scanner;

public class Add {
    public static void addElementInCollection(){
        System.out.println("добавление нового слова в словарь");

        System.out.println("введите новое слово");
        Scanner scanner1 = new Scanner(System.in);
        String newWord =scanner1.nextLine();

        System.out.println("введите определение нового слова");
        Scanner scanner2 = new Scanner(System.in);
        String newDefinition =scanner2.nextLine();
        String word = new String (newWord);
        String definition = new String(newDefinition);
        CollectionWork.vcCollection.put(word, definition);


    }
}
