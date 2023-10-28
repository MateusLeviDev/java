package C2_List.teste;

import C2_List.domains.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>(List.of(
                new User(3, "Levi"),
                new User(2, "Souza"),
                new User(5, "Omar"))
        );

        // *_________________________________________________*

        users.sort(Comparator.comparing(User::getId));

        System.out.println(users);

    }
}
