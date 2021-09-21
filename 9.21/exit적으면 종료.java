import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			String str = sc.next();
			if (str.equals("exit")) 
			{
				System.out.println("종료되었습니다."); break;
			}
		}
	}
}

