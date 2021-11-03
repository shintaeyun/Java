class Sportcar extends Car {
	void whoami() {
		System.out.println("나는 스포츠카다.");
	}
}


public class PolymorDemo {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[2];
		v[0] = new Car();
		v[1] = new Sportcar();
		for (Vehicle i:v) {
			i.whoami();
		}
	}

}

