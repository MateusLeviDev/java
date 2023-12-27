package O_Deitel_Java.PrimitiveDataTypes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Practice: create variables for the following fields and print
 * I <name>, living at <address>, confirm that I received
 * the <salary> on <date>
 */

public class Test {
    public static void main(String[] args) {
        String name = "Mateus";
        String address = "Rua Almir Monteiro, 369";
        double salary = 1000.00;
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("I " + name + " living at " + address + ", confirm that I received the salary of "
                + salary + " on " + dateTime.format(DateTimeFormatter.ISO_DATE));
    }
}
