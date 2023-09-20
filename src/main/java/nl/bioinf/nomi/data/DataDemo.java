package nl.bioinf.nomi.data;

public class DataDemo {

    public static void main(String[] args) {
        String greeting = "Hello"; //'Hello'
        String quote = "He sayd, \"With sugar and milk please!\"" + '"';
        char gNuc = 'G';

        boolean isAlive = false;

        short s = 1;
        byte b = 3;
        int x = 42;

        long l = 23383838383838383L;

        double pi = 3.1425;
        double reallyBig = 2E14;
        float piF = 3.1415f;

        System.out.println((int)gNuc);

        showIncrement();
    }

    private static void showIncrement() {
        byte b = 125;
        for (int i = 0; i < 10; i++) {
            System.out.println("b = " + b);
            b++;
        }
        Byte b2 = Byte.valueOf(b);
        byte b3 = 10;
        Byte b4 = Byte.valueOf(b3);
        Integer b5 = b2 + b4;
        System.out.println("125 + 10 = " + (b + b2));

    }
}
