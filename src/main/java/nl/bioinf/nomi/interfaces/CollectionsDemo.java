package nl.bioinf.nomi.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Michiel", "Ronald", "Dave");

        List<String> names2 = new ArrayList<>();
        names2.addAll(names);

        List<String> names3 = new LinkedList<>();
        names3.addAll(names);

        names.contains("Michiel");
        names2.remove("Michiel");
        names3.remove("Michiel");


        List<Printable> printables = new LinkedList<>();
        printables.add(new PrintableToTerminal());
        printables.add(new Printable() {
            @Override
            public void write(String message) {
                System.out.println(message);
            }
        });

        for (Printable p : printables) {
            p.write("Hallo");
        }



    }
}
