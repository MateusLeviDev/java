package D_List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //Initializing Mutable Lists
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 33, 87, 65, 32, 11, 2, 5, 6, 91, 52, 21, 43, 19));

        List<Integer> arr2 = new ArrayList<>();
        Collections.addAll(arr2, 10, 33, 87, 65, 32, 11, 2, 5, 6, 91, 52, 21, 43, 19);

        //Initializing Immutable Lists
        List<Integer> arr3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> arr4 = Collections.unmodifiableList(arr2);

        //print ways

        arr1.forEach(System.out::println);

        for (Integer arr : arr2) {
            System.out.printf("%d%n", arr);
        }
    }
}
