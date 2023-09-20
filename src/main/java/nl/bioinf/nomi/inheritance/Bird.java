package nl.bioinf.nomi.inheritance;

public class Bird extends WalkingAnimal{
    public Bird(String speciesName) {
        super(2, speciesName);
    }

    public void fly() {
        System.out.println(this.speciesName + " is flying");
    }
}
