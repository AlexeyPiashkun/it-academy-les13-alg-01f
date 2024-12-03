package by.epam_12tr.main;

public class Main01 {

	public static void main(String[] args) {

		double rezult;
		double x = 0.5;

		rezult = Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin((Math.PI * x) / (x + 2d / 3d))) + 1.7;

		System.out.println(rezult);
	}

}
