class Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}



public class DriverEx {

	public static void main(String[] args) {
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		d.drive(t); //매서드 오버라이딩은 예외
		d.drive(b);
	}

}
