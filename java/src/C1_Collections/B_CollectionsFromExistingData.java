package C1_Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class B_CollectionsFromExistingData {
    public static void main(String[] args) {
        //criar uma pub class User and add equals e hashcodes

        ArrayList<String> data = new ArrayList<>(List.of(
                "ab", "bc", "cd", "ab", "bc", "cd"
        ));

        List<String> list = new ArrayList<>(data); // will add data as is
        Set<String> set1 = new HashSet<>(data); // will add data keeping only unique values
        TreeSet<String> set2 = new TreeSet<>(data); // will add data keeping unique values and sorting
        Set<String> set3 = new LinkedHashSet<>(data); // will add data keeping only unique values and preserving the original order

        List<String> collect = Stream.of("xyz", "abc").collect(Collectors.toList());

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
