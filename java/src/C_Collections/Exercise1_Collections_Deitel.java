package C_Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise1_Collections_Deitel {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(List.of(
//                "Levi",
//                "Souza",
//                "Fezao",
//                "Leo",
//                "Levi",
//                "Fezao",
//                "Matheus",
//                "Joao",
//                "Gabriel",
//                "Du",
//                "Du",
//                "Luiza",
//                "Tite",
//                "Tite"));

        /*
          ArrayList<>(); // will add data as is
          hashSet<>(); // will add data keeping only unique values
          new TreeSet<>(); // will add data keeping unique values and sorting
          LinkedHashSet<>(); // will add data keeping only unique values and preserving the original order
         */

//        HashSet<String> values = new HashSet<>(list);
//
//        System.out.println("Originial values: " + list);
//        System.out.println("Unique values: " + values);

        // *___________________________________________________*

        Scanner scanner = new Scanner(System.in);
        HashSet<Object> objects = new HashSet<>();
        while (true) {
            System.out.print("put the names you want below [digit 'exit' -> to close]: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            objects.add(name);
        }

        System.out.print("Unique values: ");

        objects.forEach(System.out::println);

        System.out.println("\nEnter a first name to search. First letter UPPERCASE: ");
        String findName = scanner.nextLine();

        System.out.println(objects.contains(findName) ? "Here, " + findName : "User not found!");

        scanner.close();
    }
}
