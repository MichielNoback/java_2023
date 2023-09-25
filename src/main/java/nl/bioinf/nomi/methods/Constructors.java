package nl.bioinf.nomi.methods;

import java.util.ArrayList;
import java.util.List;

public class Constructors {
    private static List<String> names; //= List.of("Guanine", "Cytosine");

    private int start; // = 10
    private int end;

    public static void main(String[] args) {
        Constructors c = new Constructors();

    }
    //CLASS INITIALIZER
    static {
        System.out.println("In class initializer");
        names = new ArrayList<>();
        names.add("Guanine");
        names.add("Cytosine");
    }

    public Constructors() {
        this(10);
        System.out.println("in no-arg constructor");
        //this.start = 10;
    }

    //CONSTRUCTOR OVERLOADING
    public Constructors(int start) {
        System.out.println("in constructor");

        if (start <= 0) {
            throw new IllegalArgumentException("start must be positive");
        }

        this.start = start;
    }


}
