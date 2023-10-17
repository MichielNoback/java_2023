package nl.bioinf.nomi.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AminoAcidTest {

    @Test
    void testFirstEnum() {
        AminoAcid lys = AminoAcid.LYSINE;
        System.out.println("lys = " + lys);

        System.out.println(lys.threeLetterCode());

    }

    @Test
    void testUsage() {
        String aaName = "GLYCINE";
        AminoAcid aa = AminoAcid.valueOf(aaName);
        System.out.println(aa);

        for (AminoAcid aav : AminoAcid.values()) {
            System.out.println("aav = " + aav);
        }

        String aaCode = "Gly";
        AminoAcid.fromCode(aaCode);
    }

}