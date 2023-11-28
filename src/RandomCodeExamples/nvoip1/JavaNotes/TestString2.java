package RandomCodeExamples.nvoip1.JavaNotes;

import java.util.Scanner;

public class TestString2 {
    //1. Declare a string.
//2. Input the string.
//3. Convert the string into a character array.
//4. Input the character that is to be searched.
//5. Search for the character into the character array.
//6. If found,check if the character is lowercase or uppercase.
//If Uppercase, add 32 to the ASCII code of the character.
//If Lowercase, subtract 32 from the ASCII code of the character.
//7. Change the original character from the Character array.
//8. Convert the character array back into the string.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        char[] chars = s.toCharArray();
        System.out.println(chars);
        System.out.println("Enter the character you are looking for");
        System.out.println(s);
        String c = sc.next();
        char d = c.charAt(0);
        for (int i = 0; i <= s.length(); i++) {
            if (chars[i] == d) {
                if (d >= 'a' && d <= 'z') {
                    d -= 32;
                } else if (d >= 'A' && d <= 'Z') {
                    d += 32;
                }
                chars[i] = d;
                break;
            }
        }
        s = String.valueOf(chars);
        System.out.println(s);

        System.out.println("********************************************");

        String inputString;

        // Step 2: Input the string.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();

        // Step 3: Convert the string into a character array.
        char[] charArray = inputString.toCharArray();

        // Step 4: Input the character that is to be searched.
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        // Step 5: Search for the character into the character array.
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                // Step 6: If found, check if the character is lowercase or uppercase.
                if (Character.isUpperCase(searchChar)) {
                    // If Uppercase, add 32 to the ASCII code of the character.
                    charArray[i] = (char) (charArray[i] + 32);
                } else if (Character.isLowerCase(searchChar)) {
                    // If Lowercase, subtract 32 from the ASCII code of the character.
                    charArray[i] = (char) (charArray[i] - 32);
                }
            }
        }

        // Step 7: Change the original character from the Character array.

        // Step 8: Convert the character array back into the string.
        String modifiedString = new String(charArray);

        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}


