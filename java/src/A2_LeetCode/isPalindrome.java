package A2_LeetCode;

public class isPalindrome {
    public static void main(String[] args) {
        int number = 132;
        System.out.println(isNumberPalindrome(number));
    }

    public static boolean isNumberPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuffer sb = new StringBuffer(value);
        return sb.reverse().toString().equals(value);
    }
}
