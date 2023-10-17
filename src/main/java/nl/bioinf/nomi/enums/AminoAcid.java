package nl.bioinf.nomi.enums;

import java.util.HashMap;
import java.util.Map;

public enum AminoAcid {
    LYSINE("Lys", 'K'),
    GLYCINE("Gly", 'G'),
    PROLINE("Pro", 'P')  {
        //constant-specific class body
        public boolean isHydrophylic() {
            return false;
        }
    };

    static Map<String, Double> MOLECULAR_WEIGHTS = new HashMap<>();

    static {
        MOLECULAR_WEIGHTS.put("Lys", 146.2);
        MOLECULAR_WEIGHTS.put("Gly", 75.1);
        MOLECULAR_WEIGHTS.put("Pro", 115.1);
    }

    private final String threeLetterCode;
    private final char singleLetterCode;

    AminoAcid(String threeLetterCode, char singleLetterCode) {
        this.threeLetterCode = threeLetterCode;
        this.singleLetterCode = singleLetterCode;
    }

    //factory method
    public static AminoAcid fromCode(String aaCode) {
        switch (aaCode) {
            case "Gly": return GLYCINE;
            case "Pro": return PROLINE;
            case "Lys": return LYSINE;
            default: throw new IllegalArgumentException("No such code: " + aaCode);
        }
    }

    @Override
    public String toString() {
        return "AminoAcid[" + threeLetterCode + ']';
    }

    public String threeLetterCode() {
        return threeLetterCode;
    }

    public char singleLetterCode() {
        return this.singleLetterCode;
    }

    public double molecularWeight() {
        return MOLECULAR_WEIGHTS.get(this.threeLetterCode);
    }

    public boolean isHydrophylic() {
        return true;
    }
}
