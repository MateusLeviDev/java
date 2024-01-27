package J_Generics.consumer;

public class Customer {

    private final String firstName;
    private final String phoneNumber;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.phoneNumber = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
