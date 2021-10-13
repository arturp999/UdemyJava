import java.util.Iterator;
import java.util.Scanner;

public class testing {
	public static Scanner sc = new Scanner(System.in);

	
	
	
	public static void Ex1(){
		int x = sc.nextInt();
		for (int i = 1; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void Ex2() {
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += + 1;
			}
			else {
				out += + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
	}

	public static void Ex3() {
		int n = sc.nextInt();
		double acumulate = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				double x = sc.nextDouble();
				acumulate += x;
			}
			System.out.println(acumulate + "\n");
			acumulate = 0;
		}

		
	}

	public static void Ex4() {
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println(" impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
	}

	public static void Ex5() {
		int n = sc.nextInt();
		double x = 1;
		for (int i = 1; i < n; i++) {
			x = x + i * x ;	
		}
		System.out.println("\n" + x);
	}
	
	public static void Ex6() {
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}	
		}
	}

	public static void Ex7() {
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + i*i + " " + i*i*i);
		}
	}
	
	
	
	
	
	
	
	
	
	
}
