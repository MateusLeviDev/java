package M_Inheritance.test;

import M_Inheritance.domain.Address;
import M_Inheritance.domain.Employee;
import M_Inheritance.domain.Person;

public class Teste1 {
    public static void main(String[] args) {
        Address address = new Address();
        Person person = new Person();

        address.setRua("Oleg");
        address.setCep("333-333-333");

        person.setName("Levi");
        person.setCpf("111-111-111-09");
        person.setAddress(address);

        System.out.println(person.toString());

        Employee employee = new Employee();
        employee.setSalary(3000.00);
        employee.setName("Levi");


        System.out.println(employee.toString());
    }
}
