package logic;

import data.NamesContainer;

public class NamesOperator {
    public static String[] reverseNames(NamesContainer namesContainer){
        int tableLength = namesContainer.tableLength();
        String [] reversedNamesTable = new String[tableLength];
        for(int i=0; i<tableLength; i++){
            reversedNamesTable[i] = namesContainer.getNames()[tableLength-i-1];
        }
        return reversedNamesTable;
    }

    public static void showTableOfNames(String[] tableOfNames){
        for(int i=0; i<tableOfNames.length; i++){
            System.out.println("Cześć " + tableOfNames[i]);
        }
    }
}

