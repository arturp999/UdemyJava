package udemyOOPChapter;

import java.util.Scanner;

public class Program {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BiggerTrianglee();
		sc.close();
	}

	
	public static void BiggerTrianglee() {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		System.out.println("Enter the 1st triangle sides: ");
		t1.tA = sc.nextDouble();
		t1.tB = sc.nextDouble();
		t1.tC = sc.nextDouble();
		
		System.out.println("Enter the 2nd triangle sides: ");
		t2.tA = sc.nextDouble();
		t2.tB = sc.nextDouble();
		t2.tC = sc.nextDouble();
		
		double areaT1 = t1.TriangleArea();
		double areaT2 = t2.TriangleArea();
		System.out.printf("Area do T1 %.2f%n" , areaT1);
		System.out.printf("Area do T2 %.2f%n" , areaT2);
		
		if(areaT1 > areaT2) {
			System.out.println("T1 IS BIGGER");
		} else {
			System.out.println("T2 IS BIGGER");
		}
		
	}
	
	
	
}
