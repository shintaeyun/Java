class Person {
	public int age;
	public long height;
	public float weight;
}

public class PersonTestMain {

	public static void main(String[] args) {
		Person brother = new Person();
		brother.age=10;
		brother.height=170;
		brother.weight=67;
		System.out.println("age : " + brother.age);
		System.out.println("height : " + brother.height);
		System.out.println("weight : " + brother.weight);
	}

}
  
