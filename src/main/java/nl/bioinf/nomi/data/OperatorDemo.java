package nl.bioinf.nomi.data;

public class OperatorDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        //+ - / *
        // :?
        // %
        System.out.println("x = " + Math.pow(x, 2));
        short age = 18;
        String ageMsg = (age > 30 ? "old" : "young");
        System.out.println("you are " + ageMsg);

        for (int i = 0; i < 10; i++) {
            System.out.println(" i=" + i + " modulo=" + (i%3));
        }
    }
}
