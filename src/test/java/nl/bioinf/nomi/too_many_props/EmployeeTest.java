package nl.bioinf.nomi.too_many_props;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testEmployeeCreation() {
        Person p = new Person();
        Address a = new Address();
        Employee empl = Employee.create(p, a, "Account Manager");
    }
}