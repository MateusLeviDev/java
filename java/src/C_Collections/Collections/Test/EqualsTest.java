package C_Collections.Collections.Test;

import C_Collections.Collections.Domain.Smartphone;

public class EqualsTest {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");

//      System.out.println(s1.equals(s2)); OUTPUT: FALSE
        System.out.println(s1.equals(s2)); //Smartphone s2 = s1; OUTPUT: true
    }
}
