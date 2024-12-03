package by.epam_12tr.main;

public class Main02 {

	public static void main(String[] args) {
		

		int n = 10;
		double a = 0.50;
		double b = 1.00;

		double step = (b - a) / (n - 1); 

		System.out.println("  №" + "             x" + "             f(x)");

		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			double result = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3)))+ 1.7;

			System.out.printf("%2d\t%15.6f\t%15.6f\n", i + 1, x, result);
		}
	}

}