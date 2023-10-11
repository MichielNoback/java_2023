package nl.bioinf.nomi.encapsulation;

import nl.bioinf.nomi.inheritance.Animal;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void addAnimal_whenNull() {
        Zoo z = new Zoo();
        assertThrows(IllegalArgumentException.class,
                () -> z.addAnimal(null));
    }

    @Test
    void getAllAnimals() {
        Zoo z = new Zoo();
        z.addAnimal(new Animal("Zebra"));
        z.addAnimal(new Animal("Kangaroo"));
        //z.addAnimal(null);
        z.addAnimal(new Animal("Cobra"));

        List<Animal> allAnimals = z.getAllAnimals();
        //allAnimals.add(null);
        //z.printZoo();
        System.out.println(allAnimals);

        z.addAnimal(new Animal("Mouse"));
        //z.printZoo();
        System.out.println(allAnimals);


//        for (Animal animal: allAnimals) {
//            animal.breathe();
//        }
    }
}