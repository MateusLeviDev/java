package L_Lambda;

public class FunctionalInterface {
	public static void main(String[] args) {
		process(() -> System.out.println("Hello World")); // passed with a lambda directly

		Runnable r1 = () -> System.out.println("Hello World 2");
		process(r1);

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello World 3");  //uses a anonymous class
			}
		};

		process(r2);
	}

	public static void process(Runnable r) {
		r.run();
	}
}
