package nl.bioinf.nomi.encapsulation;

public class DnaNucleotide extends Nucleotide{
    public DnaNucleotide(char nucleotideLetter) {
        super(nucleotideLetter);
    }

    @Override
    public char getComplement() {
        switch (this.getNucleotide()) {
            case 'A': return 'T';
            case 'T': return 'A';
            case 'G': return 'C';
            case 'C': return 'G';
            default: throw new IllegalArgumentException("no complement for " + this.getNucleotide());
        }
    }
}
