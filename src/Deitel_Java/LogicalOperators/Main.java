package Deitel_Java.LogicalOperators;

public class Main {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean result = a ^ b;
        //The operator "^" is known as the exclusive or operator. It returns true if exactly one of the operands is true and false otherwise.
        //This type of operation can be useful in security systems where different combinations of permissions are required to ensure access to certain functionalities or resources.

        boolean result2 = a && b; //both true
        boolean result3 = a || b; //only onde true

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
