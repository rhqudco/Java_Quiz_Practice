import java.util.Arrays;
import java.util.Scanner;

public class EX34 {
    public static void main(String[] args) {
        /*
         * # 배열 컨트롤러[1단계] : 추가
         *
         * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에 하는 것이 일반적인 정책이다.
         *
         */
        Scanner scan = new Scanner(System.in);
        int[] arr = {10, 20, 0, 0, 0};
        int cnt = 2;
        while (true) {
            System.out.print("값을 입력해 주세요 : ");
            int val = scan.nextInt();

            if(cnt < arr.length) {
                arr[cnt] = val;
                cnt++;
            } else {
                System.out.println("더 이상 입력할 수 없습니다");
            }
            // 확인
            for( int i = 0; i < arr.length; i++ ) {
                System.out.printf("%d ", arr[i]);
            } // for
            System.out.println();
        } // while
    }
}