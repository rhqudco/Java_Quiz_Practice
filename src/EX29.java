import java.util.Arrays;
import java.util.Scanner;

public class EX29 {
    public static void main(String[] args) {
        int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
        int[] scores  = {  87,   11,   45,   98,   23};

        // 문제) 학번을 입력받아 성적 출력
        // 		단, 없는학번 입력 시 예외처리
        // 예)
        // 학번 입력 : 1002		성적 : 11점
        // 학번 입력 : 1000		해당학번은 존재하지 않습니다.
        Scanner scan = new Scanner(System.in);
        System.out.println("학번을 입력해 주세요.");
        int tmp = 0;
        int num = scan.nextInt();
        for(int i = 0; i < hakbuns.length; i++) {
            if(hakbuns[i] == num) {
                System.out.println(scores[i]);
                break;
            }
            tmp++;
        }
        if(tmp == hakbuns.length)
        System.out.println("해당 학번은 존재하지 않습니다.");
    }
}
