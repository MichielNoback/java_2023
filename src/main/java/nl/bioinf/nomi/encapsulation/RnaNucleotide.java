package nl.bioinf.nomi.encapsulation;

public class RnaNucleotide extends Nucleotide{
    public RnaNucleotide(char nucleotideLetter) {
        super(nucleotideLetter);
    }

    @Override
    public char getComplement() {
        switch (this.getNucleotide()) {
            case 'A': return 'U';
            case 'T': return 'A';
            case 'G': return 'C';
            case 'C': return 'G';
            default: throw new IllegalArgumentException("no complement for " + this.getNucleotide());
        }
    }
}
