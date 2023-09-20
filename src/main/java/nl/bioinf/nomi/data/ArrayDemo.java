package nl.bioinf.nomi.data;

import nl.bioinf.nomi.inheritance.Animal;
import nl.bioinf.nomi.inheritance.Bird;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        System.out.println("animals = " + Arrays.toString(animals));
        animals[1] = new Bird("Buzzard");
        animals[1].breathe();

        String[] greetings = {"Hallo", "Moi", "Nice to meet you"};
        int[] numbers = {2, 3, 4, 5};

        String sequence = "GACCTAGACGATCA";
        char[] chars = sequence.toCharArray();
        for (char n : chars) {
            //
        }
    }
}
