package RandomCodeExamples.nvoip1.JavaNotes;

import java.math.BigInteger;
import java.security.SecureRandom;

public class GenerateRandomToken {

    public static String generateRandomToken() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[16];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16);
    }

    public static void countChars(String string) {
        int count = string.length();
        System.out.println("Size: " + count);
    }

    public static void main(String[] args) {
        String widgetToken = generateRandomToken();
        System.out.println(widgetToken);

        countChars(widgetToken);
    }
}
