package nl.bioinf.nomi.encapsulation;

import java.util.ArrayList;
import java.util.List;

public final class App {
    static List<Nucleotide> nucleotides = new ArrayList<>();

    public static void main(String[] args) {
        nucleotides.add(new RnaNucleotide('A'));
        nucleotides.add(new DnaNucleotide('A'));
        for (Nucleotide nuc: nucleotides) {
            System.out.println(nuc.getComplement());
        }
    }
}
