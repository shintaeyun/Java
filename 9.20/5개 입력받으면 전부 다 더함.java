import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0, sum = 0;
		
		while (cnt < 5) {
			int num = sc.nextInt();
			cnt += 1;
			if (num < 0) {
				continue;
			} else {
				sum += num;
			}
			
		}
		System.out.printf("%d", sum);

	}
}

