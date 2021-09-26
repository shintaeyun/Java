class Circle {
	double radius;
	String color;
	
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public Circle(double r) {
		radius = r;
		color = "파랑";
	}
	
	public Circle(String c) {
		radius = 10.0;
		color = c;
	}

	public Circle() {
		radius = 10.0;
		color = "빨강";
	}
}


