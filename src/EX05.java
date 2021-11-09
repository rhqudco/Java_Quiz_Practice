import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        /*
         * # 구구단 게임[1단계]
         *
         * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
         * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
         * 예)    3 x 7 = ?
         * 3. 문제에 해당하는 정답을 입력받는다.
         * 4. 정답을 비교 "정답!" 또는 "땡!"을 출력한다.
         */
        System.out.println("숫자 2개를 입력해 주세요.");
        Scanner scan = new Scanner(System.in);
        int one = scan.nextInt();
        int two = scan.nextInt();
        System.out.println(one + " * " + two + " = " + "?");
        System.out.println("정답은?");
        int answer = scan.nextInt();
        if(one*two == answer)  {
            System.out.println("정답입니다.");
        }
        else {
            System.out.println("틀렸습니다.");
        }
    }
}