package nl.bioinf.nomi.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AminoAcidClassTest {

    @Test
    void testAminoAcidClass() {
        AminoAcidClass aa = new AminoAcidClass("Glycine", "Gly", 'G');
        System.out.println(aa);
        AminoAcidClass aa2 = new AminoAcidClass("Glycine", "Gly", 'G');
        assertEquals(aa, aa2);
    }

}