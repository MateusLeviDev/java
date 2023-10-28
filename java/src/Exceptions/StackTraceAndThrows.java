package Exceptions;

public class StackTraceAndThrows {

    public static void main(String[] args) {

        int[] num = {2, 8, 6, 58, 40, 56};
        int[] div = {2, 0, 6, 4, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + div[i] + "= " + (num[i] / div[i]));

            } catch (Exception exception) {
                System.out.println(exception.getStackTrace());
                exception.printStackTrace();
            }
        }
    }
}
