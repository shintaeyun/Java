import java.util.Scanner;

public class StudentScore2 {
    // 성적 관리 프로그램(for each문)
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수를 쓰시오 : ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i=0;i<scores.length;i++) {      // for ~ each문 --> for(타입 변수 : 배열)
            scores[i] = in.nextInt();
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i : scores) {      // scores 배열의 값을 i(변수)에 대입한다.
            System.out.print(i+ " ");
        }
        System.out.println();

        for (int i=0;i< scores.length;i++) {
            if (scores[i] >= 90)
                System.out.println((i+1) + "번 학생의 등급은 A 입니다.");
            else if (scores[i] >= 80)
                System.out.println((i+1) + "번 학생의 등급은 B 입니다.");
            else if (scores[i] >= 70)
                System.out.println((i+1) + "번 학생의 등급은 C 입니다.");
        }
    }
}

