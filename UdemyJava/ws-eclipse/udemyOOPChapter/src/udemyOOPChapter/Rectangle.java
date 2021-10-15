package udemyOOPChapter;

public class Rectangle {
	public double width, height;
	
	public double area() {
		return width * height;
	};
	
	public double perimeter() {
		return 2*(width+height);
	};
	
	public double diagonal() {
		return Math.sqrt((height*height) + (width*width));
	};
	
	public String toString() {
		return 
				"AREA = " + String.format("%.2f",area()) + "\n" +
				"PERIMETER = " + String.format("%.2f",perimeter()) + "\n" +
				"PERIMETER = " + String.format("%.2f",diagonal()) + "\n";
	}
	
	
}
