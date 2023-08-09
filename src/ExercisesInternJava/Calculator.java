package ExercisesInternJava;

public class Calculator {
    public static void main(String[] args) {
//        Define a Calculator class with static methods
//        for addition,subtraction, multiplication, and division.

        System.out.println(Sum(1,5));
        System.out.println(Sub(1,2));
        System.out.println(Div(10,2));
        System.out.println("---------------");
        int soma = Sum(1,3); //other way
        System.out.println(soma);
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static double Sub(int a, int b) {
        return a - b;
    }

    public static double Div(int a, int b) {
        return a / b;
    }
}
