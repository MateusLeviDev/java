package H_Exceptions.runtime.test;

public class RunTimeExceptionTest01 {
    //CHECKED
    //UNCHECKED
    public static void main(String[] args) {
        int[] numbers = {1, 2};
        System.out.println(numbers[2]);  //run time exception
    }
}
