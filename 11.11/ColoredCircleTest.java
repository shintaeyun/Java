class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	void show() {
		System.out.println("반지름이 " + radius + "인 원인다.");
	}
}

class ColoredCircle extends Circle {
	String color;
	
	ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}
	@Override
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}
}

public class ColoredCircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		
		c1.show();
		c2.show();
	}
}

