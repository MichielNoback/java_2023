package nl.bioinf.nomi.interfaces;

public class PrintableToTerminal implements Printable{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
