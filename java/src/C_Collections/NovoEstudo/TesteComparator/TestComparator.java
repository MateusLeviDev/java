package C_Collections.NovoEstudo.TesteComparator;

import C_Collections.NovoEstudo.TesteComparable.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Mateus", 8),
                new Person("Berlioz", 10),
                new Person("Napoleon", 9)
        ));
        //sorting natural order
        Collections.sort(people);
        people.forEach(System.out::println);

        //sort using comparator interface
        PersonComparator personComparator = new PersonComparator();
        people.sort(personComparator);
        people.forEach(System.out::println);
    }
}
