package RandomCodeExamples.nvoip1.JavaNotes;

import java.util.Objects;

public class TestString {
    public static void main(String[] args) {
        String firstString = "Test123";
        String secondString = "TEST123";
//        if (firstString.equalsIgnoreCase(secondString)) {
//            System.out.println("Yes");
//        }

        //do not use == to compare strings

        String name = "Mateus";
        String name1 = "Mateus";

        boolean equals = Objects.equals(name, name1);

        if (equals)
            System.out.println("Yes");

        System.out.println("**********************************");

        String strObj = new String("Hello!");
        String str = "Hello!";

        if (strObj.equals(str))
            System.out.println("YEEEEEEEEEESSSSSSSSSSSS");

        if (!strObj.equals(str))
            System.out.println("The strings are not the same object");

        String internedStr = strObj.intern();

        if (internedStr.equals(str)) {
            System.out.println("The interned string and the literal are the same object");
        }


    }
}
