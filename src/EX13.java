import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        // 문제1) 1~5까지의 합 출력
        // 정답 1) 15

        // 문제2) 1~10까지 반복해 3미만 7이상만 출력
        // 정답2) 1, 2, 7, 8, 9, 10

        // 문제3) 문제2의 조건에 맞는 수들의 합 출력
        // 정답3) 37

        // 문제4) 문제2의 조건에 맞는 수들의 개수 출력
        // 정답4) 6

        System.out.println("문제 번호를 입력하세요(1~4)");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1) {
            // 문제 1번
            int x = 0;
            for (int i = 1; i <= 5; i++) {
                x += i;
            }
            System.out.println("문제 1번 : " + x);
        }
        if (number == 2) {
            // 문제 2번
            for (int i = 1; i <= 10; i++) {
                if (i < 3 || i >= 7) {
                    System.out.print(i + " ");
                }
            }
        }
        if (number == 3) {
            // 문제 3번
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                if (i < 3 || i >= 7) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
        if (number == 1) {
            // 문제 4번
            int count = 0;
            for (int i = 1; i <= 10; i++) {
                if (i < 3 || i >= 7) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
