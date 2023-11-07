package Deitel_Java.DiveMethods;

import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three floating-point values separated by spaces: ");
		double numberOne = sc.nextDouble();
		double numberTwo = sc.nextDouble();
		double numberThree = sc.nextDouble();

		System.out.println(maximum(numberOne, numberTwo, numberThree));

		sc.close();
	}

	public static double maximum(double x, double y, double z) {
		return Math.max(x, Math.max(y, z));
	}
}
