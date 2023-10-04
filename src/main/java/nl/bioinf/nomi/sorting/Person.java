package nl.bioinf.nomi.sorting;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private String job;
    private int age;

    public Person(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public Person(String name, int age) {
        this(name, "UNEMPLOYED", age);
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Person setJob(String newJob) {
        return new Person(this.name, newJob, this.age);
    }


    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(job, person.job);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //delegation
        int nameComp = this.name.compareTo(o.name);
        if (nameComp == 0) {
            return Integer.compare(this.age, o.age);
            //also OK, but less robust
            //return this.age - o.age;
        }
        else {
            return nameComp;
        }
    }
}
