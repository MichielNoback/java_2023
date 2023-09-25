package nl.bioinf.nomi.methods;

public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo demo = new MethodsDemo();
        demo.start();
    }

    private void start() {
        var myI = 2;
        var myJ = 3;
        var sum = addIntegers(myI, myJ);
        System.out.println("sum = " + sum);
        System.out.println("sum default = " + addIntegers(5) );
    }

    private int addIntegers(int i, int j) {
        return i + j;
    }

    //METHOD OVERLOADING!
    private int addIntegers(int i) {
        //extra logic
        return addIntegers(i, 2);
    }

}
