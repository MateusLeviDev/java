package RandomCodeExamples.nvoip1;

import java.util.List;

public class ValidateNumber {
    public static void main(String[] args) {
        List<String> phoneNumbers = List.of("+1-555-5555", "+12-5555555", "+123-(555) 555-5555", "(11) 98765-4321", "+49 (30) 12345678");

        for (String phoneNumber : phoneNumbers) {
            if (phoneNumber.matches("^[+][0-9]{1,3}[-][[(]{0,1}[0-9]+[-)\\s]{0,1}]*[0-9]{4}$")) {
                System.out.println(phoneNumber + " passed validation");
            } else {
                System.out.println(phoneNumber + " failed validation");
            }
        }

        System.out.println("***********************************************************");

        for (String phoneNumber : phoneNumbers) {
            if (phoneNumber.matches("^\\+?[0-9()\\-\\s]+$")) {
                System.out.println(phoneNumber + " passed validation");
            } else {
                System.out.println(phoneNumber + " failed validation");
            }
        }

        System.out.println("***********************************************************");
    }
}

