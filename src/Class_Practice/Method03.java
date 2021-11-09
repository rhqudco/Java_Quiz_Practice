package Class_Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex03 {

    Random ran = new Random();
    Scanner scan = new Scanner(System.in);

    //문제 1)
    void setRandomValuesinArray(int [] scores) {
        for(int i = 0; i < scores.length; i++) {
            scores[i] = ran.nextInt(100)+1;
        }
        System.out.println("문제 1" + Arrays.toString(scores));
        System.out.println();
    }

    //문제 2)
    void printSumAndAverage (int [] scores) {
        int sum = 0;
        float average = 0;
        for(int i = 0; i < scores.length; i++)  {
            sum += scores[i];
        }
        average = (float)sum / 5;
        System.out.println("문제 2" + Arrays.toString(scores));
        System.out.println("총점 : " + sum + " 평균 : " + average);
        System.out.println();
    }

    //문제 3)
    void printWinner (int [] scores) {
        int cnt = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] >= 60) {
                cnt++;
            }
        }
        System.out.println("문제 3" + Arrays.toString(scores));
        System.out.println("합격자 수는 " + cnt + "명 입니다.");
        System.out.println();
    }

    //문제 4)
    void printScore1 (int [] scores) {
        System.out.println("문제 4");
        System.out.print("찾고자 하는 인덱스를 입력해 주세요 : ");
        int find = scan.nextInt();
        System.out.println(scores[find]);
    }

    //문제 5)
    void printScore2 (int [] scores) {
        System.out.println("문제 5");
        System.out.print("찾고자 하는 학생의 성적을 입력해 주세요 : ");
        int find = scan.nextInt();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == find) {
                System.out.println("이 학생의 번호는 " + i + "번 입니다");
            }
        }
    }

    //문제 6)
    void printScore3(int [] hakbuns, int [] scores) {
        System.out.println("문제 6");
        System.out.print("찾고자 하는 학번을 입력해 주세요 : ");
        int tmp = 0;
        int find = scan.nextInt();
        for(int i = 0; i < scores.length; i++) {
            if(find == hakbuns[i]) {
                System.out.println("찾은 학생의 점수는 " + scores[i] + "점 입니다.");
                break;
            }
            tmp++;
        }
        if(tmp == hakbuns.length)
            System.out.println("해당 학번은 존재하지 않습니다.");
    }

    //문제 7)
    void printNumberOne (int [] hakbuns, int [] scores) {
        int temp = 0;
        int maxhak = 0;
        for(int i = 0; i < scores.length; i++) {
            if(temp < scores[i]) {
                temp = scores[i];
                maxhak = hakbuns[i];
            }
        }
        System.out.println("문제 7");
        System.out.println(Arrays.toString(scores));
        System.out.println(maxhak + "번" + "(" + temp + "점)");
    }

}


public class Method03{

    public static void main(String[] args) {

        int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
        int[] scores  = new int[5];

        Ex03 e = new Ex03();

        // 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
        // 예 1) 87, 11, 92, 14, 47
        e.setRandomValuesinArray(scores);

        // 문제2) 전교생의 총점과 평균 출력하는 메서드
        // 예 2) 총점(251) 평균(50.2)
        e.printSumAndAverage(scores);

        // 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
        // 예 3) 2명
        e.printWinner(scores);

        // 문제4) 인덱스를 입력받아 성적 출력하는 메서드
        // 정답4) 인덱스 입력 : 1 성적 : 11점
        e.printScore1(scores);

        // 문제5) 성적을 입력받아 인덱스 출력하는 메서드
        // 정답5) 성적 입력 : 11 인덱스 : 1
        e.printScore2(scores);

        // 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
        // 단, 없는학번 입력 시 예외처리
        // 정답6) 학번 입력 : 1003 성적 : 45점
        e.printScore3(hakbuns, scores);

        // 문제7) 1등학생의 학번과 성적 출력하는 메서드
        // 정답7) 1004번(98점)
        e.printNumberOne(hakbuns, scores);

    }

}