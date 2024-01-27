package J_Generics.consumer;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer customer = new Customer("Mateus", "1234-5678");
        Mateus mateus = new Mateus("Levi");

        greetCustomerName.accept(customer);
        giveMateusCashBonus(10000, "Souzas").accept(mateus);

    }

    static Consumer<Customer> greetCustomerName =
            customer -> System.out.println("Hello " + customer.getFirstName() +
                    ", thank you for registering your phone number: "
                    + customer.getPhoneNumber());

    private static Consumer<Mateus> giveMateusCashBonus(int money, String clientName) {
        return levi -> System.out.println("Mateus " + levi.getName() + " now have " + money +
                ". Tanks for support!" + " - " + clientName);
    }
}

class Mateus {
    private final String name;

    public Mateus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}