package nl.bioinf.nomi.records;

import java.util.Objects;

public class AminoAcidClass {
    private String name;
    private String threeLetter;
    private char singleLetter;

    public AminoAcidClass(String name, String threeLetter, char singleLetter) {
        this.name = name;
        this.threeLetter = threeLetter;
        this.singleLetter = singleLetter;
    }

    public String name() {
        return name;
    }

    public String threeLetter() {
        return threeLetter;
    }

    public char singleLetter() {
        return singleLetter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AminoAcidClass that = (AminoAcidClass) o;
        return singleLetter == that.singleLetter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleLetter);
    }

    @Override
    public String toString() {
        return "AminoAcid{" + name + '|' + threeLetter + '|' + singleLetter + '}';
    }
}
