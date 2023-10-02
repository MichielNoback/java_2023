package nl.bioinf.nomi.interfaces;

import java.io.PrintStream;

public class PrintStreamSim {
    //mimics System.out.println

    public void print(String message, Printable out) {
        out.write("Via een interface!: " + message);
    }
}
