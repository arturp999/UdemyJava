package udemyOOPChapter;

public class Student {
	
	public String name;
	public double firstQuarter,secondQuarter,thirdQuarter;
	
	
	
	public double finalGrade() {
		return firstQuarter + secondQuarter + thirdQuarter;
	}
	
	public void verifyPass() {
		if(finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED" + "\n" + "MISSING " + (60-finalGrade()) + " POINTS");
		}
	}
	
}
