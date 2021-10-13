import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// k();
		// exF();
		// scannerT();

		
		// Chapter 4
		//Chapter4.Ex1();
		// Chapter4.Ex2();
		// Chapter4.Ex3();
		// Chapter4.Ex4();
		// Chapter4.Ex5();
		// Chapter4.Ex6();
		
		// Chapter 5
		// Chapter5.C5_Ex1();
		// Chapter5.C5_Ex2();
		// Chapter5.C5_Ex3();
		// Chapter5.C5_Ex4();
		// Chapter5.C5_Ex5();
		// Chapter5.C5_Ex6();
		// Chapter5.C5_Ex7();
		 Chapter5.C5_Ex8();

		sc.close();
	}

	public static void scannerT() {
		Locale.setDefault(Locale.US); // need to be added so it accepts the "." and returns value with "."
		Scanner sc = new Scanner(System.in); // creating scanner obj

		System.out.println("Please write something");

		String x = sc.next(); // for string
		System.out.println("You wrote: " + x + "\n");

		int inteiro = sc.nextInt();// for int
		System.out.println("Your number: " + inteiro + "\n");

		double db = sc.nextDouble();
		System.out.println("Your double: " + db + "\n");

		char xC = sc.next().charAt(0); // for char at loc 0
		System.out.println("The first character is: " + xC + "\n");

		sc.close(); // closes the scanner
	}

	public static void exF() {
		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'M';

		double price1 = 2100.00;
		double price2 = 650.50;
		double price3 = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s price is : €%.2f%n", product1, price1);
		System.out.printf("%s price is : €%.2f%n", product2, price2);

		System.out.printf("Record: %s years old, code %s and gender: %s", age, code, gender);

	};

	public static void k() {

		double y = 40.441212;
		String nome = "artur";
		int idade = 24;
		double renda = 24.114;

		System.out.println("Hello world " + y);
		System.out.printf("%.2f%n", y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", y);
		System.out.printf("%s tem %d anos e ganha €%.2f%n", nome, idade, renda);
	}

}
