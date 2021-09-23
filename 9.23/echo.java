public class Ex_10 {
	
	private static void echo(String string, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(string);
		}
		
	}

	public static void main(String[] args) {
		echo("안녕", 3);
	}
}
