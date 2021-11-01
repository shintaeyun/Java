import java.util.Scanner;

class Grade {
	int Math;
	int Kor;
	int Eng;
	
	public Grade(int Math, int Kor, int Eng) {
		this.Math = Math;
		this.Kor = Kor;
		this.Eng = Eng;
	}
	
	int sum() {
		return Math + Kor + Eng;
		
	}
	
	double avg() {
		return (double)sum() / 3;
	}
}

public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Math = sc.nextInt();
		int Kor = sc.nextInt();
		int Eng = sc.nextInt();
		
		Grade g = new Grade(Math, Kor, Eng);
		System.out.println("합계 : " + g.sum());
		System.out.printf("평균 : %.1f", g.avg());
		
	}
}
