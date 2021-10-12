import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// k();
		// exF();
		// scannerT();

		// chapter 4
		// Ex1();
		// Ex2();
		// Ex3();
		// Ex4();
		// Ex5();
		// Ex6();

		// Chapter 5
		// C5_Ex1();
		// C5_Ex2();
		// C5_Ex3();
		// C5_Ex4();
		// C5_Ex5();
		// C5_Ex6();
		// C5_Ex7();
		C5_Ex8();
		sc.close();
	}

	private static void C5_Ex8() {
		// 0.00 a 2000.00 -> Isento
		// 2000.01 até 3000.00 -> 8%
		// 3000.01 a 4500.00 -> 18%
		// acima de 4500.00 -> 28%
		double salario = sc.nextDouble();
		double total,disc8;
		double disc = 0;
		
		total = salario - 2000.00; //tira o valor do isento
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			disc = total * 0.08;
			System.out.printf("R$ %.2f%n",disc);
		} else if (salario <= 4500.00) {
			if (total > 1000) {
				total = total - 1000;
				disc = 1000 * 0.08;
				disc8 = total * 0.18;
				System.out.printf("R$ %.2f%n" , disc+disc8);
			} 			
		} else {
			if (total > 1000) {
				total = total - 1000;
				disc = 1000 * 0.08;
				disc8 = 1500 * 0.18;
				total = (total - 1500) * 0.28;
				System.out.printf("R$ %.2f%n" , total+disc+disc8);
			}
		}

	}

	private static void C5_Ex7() {
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

	}

	private static void C5_Ex6() {
		double value = sc.nextDouble();

		if (value >= 0 && value <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (value >= 25 && value <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if (value >= 50 && value <= 75) {
			System.out.println("Intervalo [50,75]");
		} else if (value >= 75 && value <= 100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}

	}

	private static void C5_Ex5() {
		int item = sc.nextInt();
		int quantity = sc.nextInt();
		double value = 0;
		// 1 -> 4.00
		// 2 -> 4.50
		// 3 -> 5.00
		// 4 -> 2.00
		// 5 -> 1.50

		if (item == 1) {
			value = 4.00 * quantity;
		} else if (item == 2) {
			value = 4.50 * quantity;
		} else if (item == 3) {
			value = 5.00 * quantity;
		} else if (item == 4) {
			value = 2.00 * quantity;
		} else if (item == 5) {
			value = 1.50 * quantity;
		}

		System.out.printf("Total: €%.2f%n", value);

	}

	private static void C5_Ex4() {
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		int hoursPlayed;

		if (v1 < v2) {
			hoursPlayed = v2 - v1;
		} else {
			hoursPlayed = 24 - v1 + v2;
		}
		System.out.println("O jogo durou " + hoursPlayed + " Horas");

	}

	private static void C5_Ex3() {

		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		if (v1 % v2 == 0 || v2 % v1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

	private static void C5_Ex2() {
		int number = sc.nextInt();

		int evaluate = number % 2;
		if (evaluate != 1 && evaluate != -1) {
			System.out.println("Numero é par");
		} else {
			System.out.println("Numero é impar");
		}

		sc.close();

	}

	private static void C5_Ex1() {
		int number = sc.nextInt();

		if (number >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

		sc.close();
	}

	private static void Ex6() {
		Scanner sc = new Scanner(System.in);

		double A, B, C;

		// A -> Base
		// B -> Base
		// C -> Altura

		System.out.printf("Base A? : \n");
		A = sc.nextDouble();
		System.out.printf("Base B? : \n");
		B = sc.nextDouble();
		System.out.printf("Altura C? : \n");
		C = sc.nextDouble();

		double triangle = A * C / 2;
		System.out.printf("TRIANGULO: %.3f%n", triangle);

		double circulo = 3.14159 * (C * C);
		System.out.printf("CIRCULO: %.3f%n", circulo);

		double trapezio = (A + B) / 2 * C;
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);

		double quadrado = (B * 4);
		System.out.printf("QUADRADO: %.3f%n", quadrado);

		double retangulo = (A * B);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

	private static void Ex5() {
		Scanner sc = new Scanner(System.in);

		int piece = 0, numberPieces = 0;
		double value = 0;
		double valuePay = 0;

		for (int i = 0; i < 2; i++) {
			piece = sc.nextInt();
			numberPieces = sc.nextInt();
			value = sc.nextDouble();
			valuePay = (value * numberPieces) + valuePay;
		}

		System.out.printf("VALOR A PAGAR: €%.2f%n", valuePay);
		sc.close();
	}

	private static void Ex4() {
		Scanner sc = new Scanner(System.in);

		int employN, totalH;
		double calculateSalary, valueH;

		System.out.println("Numero de empregado: ");
		employN = sc.nextInt();
		System.out.println("Horas trabalhadas: ");
		totalH = sc.nextInt();
		System.out.println("Valor por hora: ");
		valueH = sc.nextDouble();

		calculateSalary = totalH * valueH;

		System.out.printf("Number = %s%n", employN);
		System.out.printf("Valor a receber: €%.2f%n", calculateSalary);

	}

	public static void Ex3() {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		dif = A * B - C * D;

		System.out.println("Diference : " + dif);
		sc.close();

	}

	public static void Ex2() {
		Locale.setDefault(Locale.US);

		double raio = 100.64;
		double fArea = 3.14159 * (raio * raio);

		System.out.printf("A = %.4f", fArea);

	}

	public static void Ex1() {
		Scanner sc = new Scanner(System.in); // creating scanner obj

		System.out.println("First number :");
		int y = sc.nextInt();

		System.out.println("Second number :");
		int x = sc.nextInt();

		int soma = y + x;

		System.out.println("O valor da soma: " + soma);
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
