package nl.bioinf.nomi.inheritance;

import java.util.Arrays;

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
        System.out.println("giraffe = " + giraffe);
        giraffe.walk(50);
        //giraffe.fly();
        Bird mallard = new Bird("Mallard");
        System.out.println("mallard = " + mallard);
        mallard.walk(5);
        mallard.fly();
    }


}
