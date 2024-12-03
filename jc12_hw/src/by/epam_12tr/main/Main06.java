package by.epam_12tr.main;

public class Main06 {

	public static void main(String[] args) {
		int n = 20;
		double a = 3 * Math.pow(10, 3);
		double b = 6 * Math.pow(10, 4);
		double m = 4.0;
		int count = 0;

		double T1 = Math.sqrt(a + b + m);
		double T2 = m * Math.sqrt(a + b);
		double T3 = Math.sqrt(a * b * m);
		double T4 = m * Math.sqrt(a * b);

		int i = 1;
		for (int k = -30; k <= 60; k++) {
			int result = k * k * k - 25 * k * k + 50 * k + 1000;
			if ((result > T1 && result < T2) || (result > T3 && result < T4)) {
				System.out.printf("(%5d)", result);
				i++;
			} else {
				count++;
			}
		}
		
		System.out.println();
		System.out.println("Значения удовлетворяющие значению : " + count);

	}	

}
