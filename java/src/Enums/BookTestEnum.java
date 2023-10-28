package Enums;

public class BookTestEnum {
    public static void main(String[] args) {
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
