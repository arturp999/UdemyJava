package udemyOOPChapter;





public class Triangle {
	public double tA, tB, tC;

	
	
	
	public double TriangleArea() {
		double p = (tA + tB + tC) / 2.0;
		return Math.sqrt(p * (p - tA) * (p - tB)* (p - tC));
	}
	
	
}

