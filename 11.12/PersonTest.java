class Person {
	int age;
	String name;
	
	Person (int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
	}
}

class Student extends Person {
	int hakbun;
	
	Student (int age, String name, int hakbun) {
		super(age, name);
		this.hakbun = hakbun;
	}
	
	@Override
	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + hakbun + "]");
	}
	
}

class ForeignStudent extends Student{
	String foreign;
	
	ForeignStudent(int age, String name, int hakbun, String foreign) {
		super(age, name, hakbun);
		this.foreign = foreign;
	}
	
	
	@Override
	void show() {
		System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + hakbun + ", 국적 : " + foreign + "]");
	}
	
}


public class PersonTest {

	public static void main(String[] args) {
		Person[] p1 = {new Person(22, "길동이"), new Student(23, "황진이", 100), new ForeignStudent(30, "Amy", 200, "U.S.A")};
		for (Person p2 : p1) {
			p2.show();
		}
	}

}

