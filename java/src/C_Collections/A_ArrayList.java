package C_Collections;

import java.util.*;

public class A_ArrayList {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        //adding objects
        objects.add("Apple");
        objects.add("Banana");

        //iterating over list
        objects.forEach(System.out::println);
        objects.parallelStream().forEach(System.out::println);

        //iterating over map
        Map<Integer, String> names = new HashMap<>();
        names.put(1,"Levi");
        names.put(2,"Souza");
        names.put(3,"Omar");

        names.forEach((id, name) -> System.out.println("Id: " + id + "\name: " + name));


    }
}