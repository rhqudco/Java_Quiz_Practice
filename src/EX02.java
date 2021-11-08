import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        /*
         * # 가위(0)바위(1)보(2) 게임[1단계]
         *
         * 1. com은 바위(1)만 낼 수 있다.
         * 2. me는 0~2 사이의 숫자를 입력받는다.
         * 3. com과 me를 비교해,
         *         1) 비겼다.
         *         2) 내가 이겼다.
         *         3) 내가 졌다.            를 출력한다.
         */
        Scanner scan = new Scanner(System.in);
        int com = 1;
        System.out.println("가위(0) 바위(1) 보(2)");
        int me = scan.nextInt();

        if(me < 3) {
            if(me == 0) {
                System.out.println("내가 졌다.");
            }
            if(me == com) {
                System.out.println("비겼다");
            }
            if( me == 2) {
                System.out.println("내가 이겼다.");
            }
        }
        else {
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
        }
    }
}
