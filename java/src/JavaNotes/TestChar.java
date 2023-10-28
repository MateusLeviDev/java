package JavaNotes;

public class TestChar {
    public static void main(String[] args) {
        char tab = '\t';
        System.out.println(tab);

        char backspace = '\b';
        char newline = '\n';
        char carriageReturn = '\r';
        char formFeed = '\f';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char heart = '\u2764';

        System.out.println("********************");
        System.out.println(Character.toString(heart));

        for (int i = 0; i <= 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter);
        }

    }
}
