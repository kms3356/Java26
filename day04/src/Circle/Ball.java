package Circle;

public class Ball extends Circle{
	Ball(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * PI * 4;
	}

}
