package nl.bioinf.nomi.inheritance;

public class WalkingAnimal extends Animal {
    protected int numberOfLimbs;

    public WalkingAnimal(int numberOfLimbs, String speciesName) {
        super(speciesName);
        if (numberOfLimbs < 0) {
            throw new IllegalArgumentException("Negative number of limbs: " + numberOfLimbs);
        }
        this.numberOfLimbs = numberOfLimbs;
    }

    public WalkingAnimal(String speciesName) {
        super(speciesName);
        this.numberOfLimbs = 4;
    }

    public void walk(double speed) {
        System.out.println(this.speciesName
                + " walking at speed "
                + speed
                + " on "
                + this.numberOfLimbs
                + "limbs");
    }
}
