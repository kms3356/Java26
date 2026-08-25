package Circle;

public class Circle {
	static double PI = 3.14;
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	Circle() {
		
	}
	public double getArea() {
		return radius * radius * PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(int rad) {
		radius = rad;
	}
}
