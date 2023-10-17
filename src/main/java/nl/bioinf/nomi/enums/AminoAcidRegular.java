package nl.bioinf.nomi.enums;

public class AminoAcidRegular {
    public static final AminoAcidRegular GLYCINE = new AminoAcidRegular("Glycine");
    public static final AminoAcidRegular LYSINE = new AminoAcidRegular("Lysine");
    public static final AminoAcidRegular PROLINE = new AminoAcidRegular("Proline");
    private final String name;

    private AminoAcidRegular(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
