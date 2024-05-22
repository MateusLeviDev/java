package D_List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //adding
        arr.add(7);
        arr.forEach(System.out::println);

        //removing
        arr.remove(2);
        arr.forEach(System.out::println);

        //Changing Elements
        arr.addFirst(3);

        //get element
        int n = arr.getLast(); //index, etc
        System.out.println(n);

        //sorting
        List<String> arr2 = new ArrayList<>(Arrays.asList("Levi", "Lucas", "Julia", "Francisca", "Mateus"));
        Collections.sort(arr2);
        arr2.forEach(System.out::println);

        //size
        int size = arr2.size();

        //copy elements. dff between reference and constructor
        List<String> arr3 = new ArrayList<>(List.copyOf(arr2));
        arr3.removeFirst();
        arr3.forEach(System.out::println);
    }
}
