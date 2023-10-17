package nl.bioinf.nomi.records;

import java.util.HashMap;
import java.util.Map;

public record AminoAcidRecord(String name, String threeLetter, char singleLetter) {
    //compiler-generated
    // private instance variables
    // Constructor
    // getters for all properties/variables
    // toString()
    // hashCode() on all properties
    // equals() idem
    static Map<String, Double> MOLECULAR_WEIGHTS = new HashMap<>();

    static {
        MOLECULAR_WEIGHTS.put("Lys", 146.2);
        MOLECULAR_WEIGHTS.put("Gly", 75.1);
        MOLECULAR_WEIGHTS.put("Pro", 115.1);
    }

    public double molecularWeight() {
        return MOLECULAR_WEIGHTS.get(this.threeLetter);
    }
}
