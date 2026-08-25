package Circle;

public class Cylinder extends Circle{
	double height;
	Cylinder(double radius, double height){
		this.height = height;
		this.radius = radius;
	}
	
	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2 * PI * radius * radius + 2 * PI * radius * height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
}
