package nl.bioinf.nomi.records;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AminoAcidRecordTest {
    @Test
    void testAminoAcidClass() {
        AminoAcidRecord aa = new AminoAcidRecord("Glycine", "Gly", 'G');
        System.out.println(aa);
        AminoAcidRecord aa2 = new AminoAcidRecord("Glycine", "Gly", 'G');
        assertEquals(aa, aa2);

    }
}