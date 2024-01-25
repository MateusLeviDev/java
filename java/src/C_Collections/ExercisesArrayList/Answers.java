package C_Collections.ExercisesArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Answers {
    public static void main(String[] args) {

        //exercise 1 //List.of immutable
        List<String> stringList = new ArrayList<>(List.of("Blue", "Red", "Green", "Yellow", "Black"));
//        stringList.forEach(System.out::println);

        //exercise 2 iterate through all e
        for (String list : stringList) {
//            System.out.println(list);
        }

        //exercise 3 but my object is immutable

        //exercise 4
//        System.out.println("Element at index 1 is: " + stringList.get(1));

        //exercise 5 update a Array use set(index, newElement);

        //exercise 6
        stringList.remove("Green");

        //Write a Java program to copy one array list into another.
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(11,2,3,9,20));

        //Collections.copy(stringList, integers); //cannot different types hahahah

        Collections.shuffle(integers);
        Collections.reverse(integers);
        System.out.println(integers);

        //IntStream
        IntStream.range(0, stringList.size())
                .forEach(index -> System.out.println((index + 1) + " - " + stringList.get(index)));

    }
}
