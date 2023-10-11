package nl.bioinf.nomi.inheritance;

public class Animal {
    protected String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void breathe() {
        System.out.println("breathe in, and out. Don't forget.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", speciesName='" + speciesName + '\'' +
                '}';
    }
}
