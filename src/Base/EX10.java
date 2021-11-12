package Base;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class EX10 {
    public static void main(String[] args) {
        /*
         * # 최대값 구하기[1단계]
         *
         * 1. 숫자 3개를 입력받는다.
         * 2. 입력받은 3개의 수를 비교하여,
         * 3. 가장 큰 수(MAX)를 출력한다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 3개를 입력해 주세요.");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        int temp = 0;
        /*if(x > y) {
            temp = x;
            if(temp < z) {
                temp = z;
                System.out.println("z가 가장 큽니다.");
            }
            else {
                System.out.println("x가 가장 큽니다.");
            }
        }
        else if(y > x) {
            temp = y;
            if(temp < z) {
                temp = z;
                System.out.println("z가 가장 큽니다.");
            }
            else {
                System.out.println("y가 가장 큽니다.");
            }
        }*/
        temp = x;
        if(temp < y) {
            temp = y;
        }
        if(temp < z) {
            temp = z;
        }
        System.out.println("최대값 : " + temp);
    }
}
