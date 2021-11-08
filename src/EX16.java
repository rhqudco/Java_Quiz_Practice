import java.util.Random;
import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {
        /*
         * # Up & Down 게임[2단계]
         *
         * 1. 정답을 맞추면 게임은 종료된다.
         * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
         * 3. 게임 종료 후, 점수를 출력한다.
         *
         */
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        int com = rand.nextInt(100)+1;
        int score = 100;
        while (true) {
            System.out.print("정답 입력: ");
            int me = scan.nextInt();
            if (me < com) {
                System.out.println("Up!");
                score = score - 5;
            } else if (me > com) {
                System.out.println("Down!");
                score = score - 5;
            } else {
                System.out.println("Bingo!");
                System.out.println("점수는 " + score + "점 입니다.");
                break;
            }
        }
    }
}
