import Chap_06.One;

public class Three {
	One o = new One();
	void print() {
		//System.out.println(secret);
		//System.out.println(o.roommate); //디폴드 값 안됨
		//System.out.println(o.child); //protected 도 안됨
		System.out.println(o.anybody);
	}
}
