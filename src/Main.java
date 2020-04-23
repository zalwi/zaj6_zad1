import data.NamesContainer;
import logic.NamesOperator;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int namesSize = 3;
        NamesContainer collegeNames = new NamesContainer(namesSize);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + namesSize + " imion");
        for(int i=0; i<namesSize; i++) {
            collegeNames.addName(scanner.nextLine());
        }
        System.out.println(collegeNames.toString());
        NamesOperator.showTableOfNames(NamesOperator.reverseNames(collegeNames));
    }
}
