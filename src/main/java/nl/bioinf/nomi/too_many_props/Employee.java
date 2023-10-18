package nl.bioinf.nomi.too_many_props;

import java.util.ArrayList;
import java.util.List;

public record Employee(Person person, List<Address> addresses, List<String> functions) {
    //LocalDate now = LocalDate.now();
//    Person person;
//    List<Address> addresses = new ArrayList<>();
//    List<String> functions = new ArrayList<>();


    //FACTORY
    public static Employee create(Person person, Address address){
        return create(person, address, "Lowest");
    }

    public static Employee create(Person person, Address address, String function){
        return new Employee(person,
                List.of(address),
                List.of(function));
    }
}
