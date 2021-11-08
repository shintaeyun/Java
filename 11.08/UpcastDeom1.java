class Person {
	String name = "사람";
	
	void whoami() {
		System.out.println("나는 사람이다.");
	}
}

class Stud extends Person {
	int number = 7;
	
	void work() {
		System.out.println("나는 공부한다");
	}
}


public class UpcastDemo1 {
	public static void main(String[] args) {
		//Person p = new Stud();
		
		//Person p;
		//p = new Stud();
		
		Person p;
		Stud s = new Stud();
		p = s;
		
		//p.number = 1; 안됨
		//p.work(); 안됌 Stud로 생성 되었도 형변환을 Person으로 해서 Person에 있는 것만 사용가능
		p.whoami();
	}
}
