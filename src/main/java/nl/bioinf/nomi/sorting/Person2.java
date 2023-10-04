package nl.bioinf.nomi.sorting;

public record Person2(String name, String job, int age) {
    public Person2(String name, int age) {
        this(name, "UNEMPLOYED", age);
    }

    public Person2 job(String newJob) {
        return new Person2(this.name, newJob, this.age);
    }

    public int ageDiff(Person2 other) {
        return this.age() - other.age();
    }
}
