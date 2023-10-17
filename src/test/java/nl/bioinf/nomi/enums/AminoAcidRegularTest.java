package nl.bioinf.nomi.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AminoAcidRegularTest {

    @Test
    void testToString() {
        AminoAcidRegular aarl = AminoAcidRegular.LYSINE;
        System.out.println("aarl = " + aarl);
    }
}