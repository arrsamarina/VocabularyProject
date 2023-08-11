package org.example.Commands;

import java.util.Scanner;

public class CommandProcessing {
    public static void commandScanner() {
        String choice;
        do {
            System.out.println("введите команду ");
            Scanner scanner = new Scanner(System.in);
            choice = "";
            choice = scanner.nextLine();
            switch (choice) {
                case ("show"):
                    Show.showTheVocabulary();
                    break;
                case ("add"):
                    Add.addElementInCollection();
                    break;
                case ("search"):
                    Search.searchDefinition();
                    break;
                case ("help"):
                    Help.helpExecute();
                    break;
            }
        } while (!choice.equals("exit"));
        System.out.println("До свидания");
    }
}

