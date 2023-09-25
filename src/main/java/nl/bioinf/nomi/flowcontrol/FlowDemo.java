package nl.bioinf.nomi.flowcontrol;

import java.util.List;

public class FlowDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Michiel", "Barry", "Piet", "Elvira", "Roos");

        //foreach
        for (String name : names){
            System.out.println(name);
        }
        //OR
        //names.forEach(System.out::println);

        //for
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + ": " + names.get(i));
        }

        //ifelse
        if (names.size() < 5) {
            System.out.println("Too few participants for this course");
        } else if (names.size() >= 5 && names.size() < 25) {
            System.out.println("this is a single class");
        } else {
            System.out.println("we should split up");
        }

        if (names.contains("Barry")){
            System.out.println("Barry is in!");
        }

        //while() {}
        //do {} while ()

        testSwitch("Saturday");
    }

    static void testSwitch(String weekday) {
        //classic switch
        switch (weekday) {
            case "Saturday":
            case "Sunday":
                System.out.println("weekend at Gamma!"); break;
            case "Monday":
            case "Tuesday":
                System.out.println("workday at school!"); break;
            default:
                System.out.println("I don't know this day");
        }
    }

    static void testSwitchExpression(String weekday) {
        //classic switch
        switch (weekday) {
            case "Saturday", "Sunday" -> System.out.println("weekend at Gamma!");
            case "Monday", "Tuesday" -> System.out.println("workday at school!");
            default -> System.out.println("I don't know this day");
        }
    }
}
