package data;

import java.util.Arrays;

public class NamesContainer {

    String[] names;

    public NamesContainer(int size) {
        names = new String[size];
    }

    public void addName(String name){
        for (int i=0; i<names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                return;
            }
        }
        System.out.println("Tablica imion jest pełna!");
    }

    public int tableLength(){
        return names.length;
    }

    public String[] getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "NamesContainer{" +
                "names=" + Arrays.toString(names) +
                '}';
    }
}
