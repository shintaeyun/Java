public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("홍길동", 051412, 1208);
		System.out.println(st.name + ", " + st.ssn + ", " + st.hakbun);
		st.fall();
		
		Student st2 = new Student("전우치", 123456, 1209);
		System.out.println(st2.name + ", " + st2.ssn + ", " + st2.hakbun);
			
	}
}
