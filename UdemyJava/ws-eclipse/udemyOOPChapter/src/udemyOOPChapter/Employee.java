package udemyOOPChapter;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	
	public double increaseSalary(double percentage) {
		return netSalary() + (grossSalary * (percentage/100)); 
	}
	
	public void increaseSalaryV(double percentage) {
		System.out.println(String.format("%.2f",netSalary() + (grossSalary * (percentage/100)))); 
	}
	
	public String toString() {
		return "Employee: " + name +"," +" € "+ String.format("%.2f", netSalary())  ;
	}
	
	

}
