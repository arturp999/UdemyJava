import java.util.Scanner;

public class Chapter5 {
	public static Scanner sc = new Scanner(System.in);

	public static void C5_Ex8() {
		// 0.00 a 2000.00 -> Isento
		// 2000.01 até 3000.00 -> 8%
		// 3000.01 a 4500.00 -> 18%
		// acima de 4500.00 -> 28%
		double salario = sc.nextDouble();
		double total, disc8;
		double disc = 0;

		total = salario - 2000.00; // tira o valor do isento
		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			disc = total * 0.08;
			System.out.printf("R$ %.2f%n", disc);
		} else if (salario <= 4500.00) {
			if (total > 1000) {
				total = total - 1000;
				disc = 1000 * 0.08;
				disc8 = total * 0.18;
				System.out.printf("R$ %.2f%n", disc + disc8);
			}
		} else {
			if (total > 1000) {
				total = total - 1000;
				disc = 1000 * 0.08;
				disc8 = 1500 * 0.18;
				total = (total - 1500) * 0.28;
				System.out.printf("R$ %.2f%n", total + disc + disc8);
			}
		}

	}

	public static void C5_Ex7() {
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

	public static void C5_Ex6() {
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

	public static void C5_Ex5() {
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

	public static void C5_Ex4() {
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

	public static void C5_Ex3() {

		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		if (v1 % v2 == 0 || v2 % v1 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();
	}

	public static void C5_Ex2() {
		int number = sc.nextInt();

		int evaluate = number % 2;
		if (evaluate != 1 && evaluate != -1) {
			System.out.println("Numero é par");
		} else {
			System.out.println("Numero é impar");
		}

		sc.close();

	}

	public static void C5_Ex1() {
		int number = sc.nextInt();

		if (number >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

		sc.close();
	}
};
