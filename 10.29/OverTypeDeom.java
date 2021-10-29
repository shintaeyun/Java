class Vehicle2 {
	String name = "탈것";
	
	void whoami() {
		System.out.println("나는 탈 것입니다.");
	}
	
	static void move() {
		System.out.println("이동하다.");
	}
}

class Car2 extends Vehicle2 {
	String name = "자동차";
	@Override
	void whoami() {
		System.out.println("나는 자동차이다. ");
	}
	
	static void move() {
		System.out.println("달리다");
	}
}

public class OverTypeDemo {
	public static void main(String[] args) {
		Vehicle2 v = new Car2();
		System.out.println(v.name); //부모꺼 타입이 나온다
		v.whoami(); //오버라이딩 되어서 자식꺼
		v.move();
		if (v instanceof Car2) { //자식으로 변환
			Car2 c = (Car2)v;
			System.out.println(c.name); 
			c.whoami();
			c.move();
		}
	}
}
