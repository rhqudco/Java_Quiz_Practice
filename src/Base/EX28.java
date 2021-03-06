package Base;

import java.util.Arrays;
import java.util.Scanner;

public class EX28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 인덱스    0   1   2   3   4
        int[] arr = {87, 11, 45, 98, 23};

        // 문제1) 인덱스를 입력받아 성적 출력
        // 정답1) 인덱스 입력 : 1	성적 : 11점
        System.out.println("문제 1번");
        System.out.println("인덱스를 입력해 주세요.");
        int index = scan.nextInt();
        System.out.println("성적 : " + arr[index]);

        // 문제2) 성적을 입력받아 인덱스 출력
        // 정답2) 성적 입력 : 11		인덱스 : 1
        System.out.println("문제 2번");
        System.out.println("성적을 입력해 주세요.");
        int score = scan.nextInt();
        for(int i = 0; i < 5; i++) {
            if(score == arr[i]) {
                System.out.println("인덱스 : " + i);
                break;
            }
        }

        int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
        int[] scores  = {  87,   11,   45,   98,   23};

        // 문제3) 학번을 입력받아 성적 출력
        // 정답3) 학번 입력 : 1003	성적 : 45점
        System.out.println("문제 3번");
        System.out.println("학번을 입력 하세요");
        int num = scan.nextInt();
        for(int i = 0; i < 5; i++) {
            if(num == hakbuns[i]) {
                System.out.println("학번 : " + scores[i]);
                break;
            }
        }
    }
}
