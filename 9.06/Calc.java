import java.util.Scanner;

public class Calc {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자를 입력하세요 : ");
		//char opr = sc.next().charAt(0);
		String opr = sc.next();
		System.out.println("숫자를 입력해주세요 : ");
		double num1 = sc.nextDouble();
		System.out.println("숫자를 입력해주세요 : ");
		double num2 = sc.nextDouble();
		if (opr.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		else if (opr.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		else if (opr.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		else if (opr.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		else if (opr.equals("%")) {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		}
	}
