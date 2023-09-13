package nl.bioinf.nomi.inheritance;

public class Animal {
    protected int numberOfLimbs = 4;
    protected String speciesName;

    public Animal(int numberOfLimbs, String speciesName) {
        if (numberOfLimbs < 0) {
            throw new IllegalArgumentException("Negative number of limbs: " + numberOfLimbs);
        }
        this.numberOfLimbs = numberOfLimbs;
        this.speciesName = speciesName;
    }

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public void walk(double speed) {
        System.out.println(this.speciesName
                + " walking at speed "
                + speed
                + " on "
                + this.numberOfLimbs
                + "limbs");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLimbs=" + numberOfLimbs +
                ", speciesName='" + speciesName + '\'' +
                '}';
    }
}
