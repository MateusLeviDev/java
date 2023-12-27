package C_Collections.Collections.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        names.add("Mateus");
        names.add("Levi");
        names2.add("Lucas");
        names2.add("Lívia");

        names.addAll(names2);
        System.out.println(names.toString()); //list tem o método toString


//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
