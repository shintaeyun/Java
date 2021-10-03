class Top {
	public int a;  
	public int b;
	public int sum(int x, int y) {
		return x + y;
	}
}
public class TopMain {
	public static void main(String[] args) {
		Top num = new Top();
		num.a = 100;
		num.b = 200;
		int s = num.sum(3, 5);
		System.out.println("a는 " + num.a);
		System.out.println("b는 " + num.b);
		System.out.println("sum는 " + num.sum(num.a, num.b));
		System.out.println("s는 " + s);
	}

}

