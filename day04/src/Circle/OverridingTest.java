package Circle;

public class OverridingTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		
		Ball ball = new Ball(5.0);
		System.out.println(ball.getRadius());
		System.out.println(ball.getArea());
		
		Cylinder cyl = new Cylinder(5.0, 7.0);
		System.out.println(cyl.getRadius());
		System.out.println(cyl.getHeight());
		System.out.println(cyl.getArea());
	}

}
