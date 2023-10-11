package nl.bioinf.nomi.encapsulation;

import nl.bioinf.nomi.inheritance.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("No null objects allowed");
        }
        if (animal.getSpeciesName() == null) {
            throw new IllegalArgumentException("No anim,als with null names allowed");
        }
//        Objects.requireNonNull(animal);
        this.animals.add(animal);
    }

    public List<Animal> getAllAnimals() {
        //protect by
        //1: copy; is a static copy
        //2: immutable view; updates dynamically in other local references
        return new ArrayList<>(this.animals);

        //2: return Collections.unmodifiableList(this.animals);
    }

    public void removeAnimal(Animal name) {
        animals.remove(name);
    }

    public void printZoo() {
        this.animals.forEach(x -> System.out.println(x));
    }
}
