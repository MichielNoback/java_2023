package nl.bioinf.nomi.encapsulation;

public abstract class Nucleotide {
    private final char nucleotide;

    public Nucleotide(char nucleotideLetter) {
        this.nucleotide = nucleotideLetter;
    }

    public char getNucleotide() {
        //this.nucleotide = 'H';
        return nucleotide;
    }

    public abstract char getComplement();
}
