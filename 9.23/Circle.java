public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1; name = "";
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;	//this 나를 가르키는 변수
	}

	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자"); //Circle 객체 생성
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
		
}

}
