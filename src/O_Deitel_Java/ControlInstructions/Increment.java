package O_Deitel_Java.ControlInstructions;

public class Increment {
	public static void main(String[] arg) {
		int c = 5;

		// operador pós icremento

		System.out.printf("c before postincrement: %d%n", c); // print 5
		System.out.printf("         postincrement c: %d%n", c++); // print 5
		System.out.printf("c after postincrement: %d%n", c); // print 6

		System.out.println();

		System.out.printf(" c before preincrement: %d%n", c); // print 5
		System.out.printf(" preincrementing c: %d%n", ++c); // print 6
		System.out.printf(" c after preincrement: %d%n", c); // print 6
	}
}
