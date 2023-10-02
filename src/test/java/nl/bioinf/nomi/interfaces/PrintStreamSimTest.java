package nl.bioinf.nomi.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintStreamSimTest {
    Printable printable = new Printable() {
        @Override
        public void write(String message) {
            System.out.println(message);
        }
    };

    @Test
    void print() {
        PrintStreamSim sim = new PrintStreamSim();
        sim.print("Printer", new PrintableToTerminal());

        sim.print("Another print", new Printable() {
            @Override
            public void write(String message) {
                System.out.println(message);
            }
        });

        sim.print("And another print",
                message -> System.out.println(message));
    }
}