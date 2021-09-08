import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		while(true) 
		{
			int num = sc.nextInt();
			sum += num;
			if (num == -1) 
			{
				sum = sum - num; break;
			}
			
		}
		System.out.println(sum);

	}  
