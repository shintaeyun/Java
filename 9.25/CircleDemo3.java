class Circle2 {
	private double radius; //<-필드를 외부로부터 은닉한다.
	
	public double getRadius() {		//접근자
		return radius;	
	}
	
	public void setRadius(double r) {	//설정자
		this.radius = r;
	}
	
	double findArea() {  
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}


public class CircleDemo3 {
	public static void main(String[] args) {
		Circle2 myCircle = new Circle2();
		
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());

	}
}

