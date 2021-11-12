package Base;

import java.util.Scanner;

public class EX20 {
    public static void main(String[] args) {
        /*
         * # 소수찾기[2단계]
         *
         * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
         * 예)
         * 입력 : 20
         * 2, 3, 5, 7, 11, 13, 17, 19
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요.");
        int num = scan.nextInt();
        for(int j = 1; j <= num; j++) { // 1, 2, 3, 4, 5, 6, 7, 8, ...

            int cnt = 0;
            for(int i = 1; i <= j; i++) {
                if (j % i == 0) { cnt++; }
            } //for

            if (cnt == 2) { System.out.println(j); }
        }// for
    }
}