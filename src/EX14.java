import java.util.Random;
import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
        /*
         * 구구단 게임[3단계]
         *
         * 1. 구구단 게임을 5회 반복한다.
         * 2. 정답을 맞추면 20점이다.
         * 3. 게임 종료 후, 성적을 출력한다.
         *
         */
        Random rand = new Random();
        int score = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("구구단을 외우자! 구구단을 외우자!");
            int fir = rand.nextInt(9) + 1;
            int sec = rand.nextInt(9) + 1;
            System.out.println(fir + " * " + sec + " = " + " ? ");
            int ans = scan.nextInt();
            if((fir*sec) == ans) {
                System.out.println("정답!");
                score += 5;
            }
            else {
                System.out.println("오답!");
            }
        }
        System.out.println("총 점수는" + score + "점 입니다!");
    }
}
