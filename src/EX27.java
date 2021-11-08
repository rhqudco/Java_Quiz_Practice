import java.util.Arrays;
import java.util.Random;

public class EX27 {
    public static void main(String[] args) {
        // 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
        // 예   1) 87, 11, 92, 14, 47
        System.out.println("문제 1번");
        Random rand = new Random();
        int[] arr_1 = new int[5];
        for(int i = 0; i < 5; i++)  {
            arr_1[i] = rand.nextInt(101) + 1;
        }
        System.out.println(Arrays.toString(arr_1));


        // 문제2) 전교생의 총점과 평균 출력
        // 예   2) 총점(251) 평균(50.2)
        System.out.println("문제 2번");
        int[] arr_2 = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++)  {
            arr_2[i] = rand.nextInt(101) + 1;
            sum += arr_2[i];
        }
        System.out.println(Arrays.toString(arr_2));
        System.out.println("점수의 합 : " + sum + " 평균 : " + (sum/5));


        // 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
        // 예   3) 2명
        System.out.println("문제 3번");
        int[] arr_3 = new int[5];
        int cnt = 0;
        for(int i = 0; i < 5; i++)  {
            arr_3[i] = rand.nextInt(101) + 1;
            if(arr_3[i] >= 60) {
                cnt++;
            }
        }
        System.out.println(Arrays.toString(arr_3));
        System.out.println("60점 이상 학생의 수 : " + cnt);
    }
}
