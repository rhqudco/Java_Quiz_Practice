package Base;

import java.util.Scanner;

public class EX19 {
    public static void main(String[] args) {
        /*
         * # 최대값 구하기[2단계]
         *
         * 1. 3회 반복을 하면서 정수를 입력받는다.
         * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
         *
         */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("숫자를 입력해 주세요.");
            arr[i] = scan.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("최대값은 " + max + " 입니다");
    }
}
