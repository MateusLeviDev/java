package Exceptions;

public class FirstIdeia {

    public static void main(String[] args) {

        try {
            int[] arr = new int[4];
            arr[4] = 1;
            System.out.println("-----");

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("i dont exist");
        }
    }
}
