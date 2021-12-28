
import java.util.Random;


public class RandomList {
    private int[] list;
    private Random rand;

    //원소 개수가 max개인 정수형 배열을 만든다.
    RandomList(int max) {
        rand = new Random();
        list = new int[max];
    }
    //원소 개수가 max 개인 정수형 배열을 반환한다.
    //배열 원소 값은 0부터 max - 1 사이에 난수값이 들어간다.
    //다만 원소값은 중복되지 않는다.
    int[] getList() {
        int len = list.length; //list 배열에 몇개가 있는지 센다.
        for (int i = 0; i < len; i++) {
            int n;
            while (found(n = rand.nextInt(len), i));    //복수 체크
            list[i] = n;
        }
        return list;
    }
    boolean found (int value, int n) {
        for (int i = 0; i < n; i++) {
            if (list[i] == value)
                return true;
        }
        return false;
    }
}