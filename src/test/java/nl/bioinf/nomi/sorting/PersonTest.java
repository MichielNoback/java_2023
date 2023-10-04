package nl.bioinf.nomi.sorting;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testCreatePerson(){
        Person p = new Person("Mike", 33);
        //System.out.println(p);
        Person p2 = new Person("Roger", "secret agent", 87);
        //System.out.println(p2);
        Person p3 = new Person("Roger", "secret agent", 87);

        Set<Person> persons = new HashSet<>();
        persons.add(p);
        persons.add(p2);
        System.out.println(persons);
        //persons.getClass();
    }

    @Test
    void testCreatePerson2(){
        //Person2 p = new Person2("Mike", 33);
        //System.out.println(p);
        Person2 p2 = new Person2("Roger", "secret agent", 87);
        //System.out.println(p2);
        Person2 p3 = new Person2("Roger", "secret agent", 87);

        System.out.println(p2);
        System.out.println(p2.equals(p3));
        System.out.println(p2.name());
    }

    @Test
    void testEquality() {
        Person p = new Person("Mike", 33);
        //System.out.println(p);
        Person p2 = new Person("Roger", "secret agent", 87);
        //System.out.println(p2);
        Person p3 = new Person("Roger", "secret agent", 87);
        //p2.equals(p3)
        assertEquals(p2, p3);
        assertEquals(p3, p2);
//        System.out.println(p2.hashCode());
//        System.out.println(p3.hashCode());
    }

    @Test
    void testPersonSorting() {
        Person p1 = new Person("Mike", 33);
        Person p2 = new Person("Roger", "secret agent", 87);
        Person p3 = new Person("Ian", "programmer", 23);
        Person p4 = new Person("Sue", "architect", 45);
        Person p5 = new Person("Roger", "manager", 35);
        Person p6 = new Person("Sue", "architect", 42);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);
    }

    @Test
    void testPersonSortingWithCompare() {
        Person p1 = new Person("Mike", 33);
        Person p2 = new Person("Roger", "secret agent", 87);
        Person p3 = new Person("Ian", "programmer", 23);
        Person p4 = new Person("Sue", "architect", 45);
        Person p5 = new Person("Roger", "manager", 35);
        Person p6 = new Person("Sue", "architect", 42);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);

        System.out.println(persons);
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getJob().compareTo(o2.getJob());
            }
        });
        System.out.println(persons);
    }
    @Test
    void sortNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }

}