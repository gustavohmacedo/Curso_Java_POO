import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		  Exercio de Fixacao
		  
		 */

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String name1 = "Computer";
		String name2 = "Officer desk";

		int age = 32;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");

		System.out.printf("%s, which price is $ %.2f%n", name1, price1);
		System.out.printf("%s, which price is: %.2f%n%n", name2, price2);
		System.out.println("Record:" + age + " years old, code " + code + " and gender: " + gender);

		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);

		System.out.printf("US decimal point: %.3f", measure);

		sc.close();

	}

}
