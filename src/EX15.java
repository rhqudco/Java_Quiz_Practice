import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
        /*
         * # 반복문 종료(-100)
         *
         * 1. 무한 반복을 하면서 숫자를 입력받는다.
         * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
         * 예)
         * 숫자 입력[EXIT:-100] : 1
         * 숫자 입력[EXIT:-100] : 3
         * 숫자 입력[EXIT:-100] : 4
         * 숫자 입력[EXIT:-100] : -100
         * 프로그램 종료
         *
         */
                Scanner scan = new Scanner(System.in);
                int number = 0;

                while (true) {
                    System.out.print("숫자 입력[EXIT:-100]: ");
                    number = scan.nextInt();
//			if (number == -100) { break; }
//			if (number == -100) { return; } // main 메서드의 종료는 프로그램의 종료와 동일
                    if (number == -100) { System.exit(0); }
                } // while
                // 다음에 실행할 명령어가 없기 때문에 종료
    } // main

}
