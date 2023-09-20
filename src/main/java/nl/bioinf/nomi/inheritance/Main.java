package nl.bioinf.nomi.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
//        System.out.println(Arrays.toString(args));
        System.out.println("Starting app");

        Main main = new Main();
        main.start();
    }

    private void start() {
        Animal giraffe = new Animal("Giraffe");
        //System.out.println("giraffe = " + giraffe);
        //giraffe.walk(50);
        //giraffe.fly();
        Bird mallard = new Bird("Mallard");
        //System.out.println("mallard = " + mallard);
        //mallard.walk(5);
        //mallard.fly();

        Fish trout = new Fish("Trout");
        List<Animal> animals = new ArrayList<>();
        animals.add(giraffe);
        animals.add(mallard);
        animals.add(trout);

        for (Animal a: animals) {
            a.breathe();
            if (a instanceof WalkingAnimal) {
                ((WalkingAnimal) a).walk(3);
            }
        }
    }


}
