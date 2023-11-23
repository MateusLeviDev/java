package Deitel_Java.LogicalOperators;

public class TaxCalculate {
	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;

		System.out.printf("%s%20s %n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; year++) {
			amount = principal * Math.pow(1 + rate, year); // a = p(1 + r)^n

			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}
}
