package Base;

import java.util.Arrays;
import java.util.Random;

public class EX21 {
    public static void main(String[] args) {
        /*
         * # 랜덤학생
         *
         * 1. 10회 반복을 한다.
         * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
         * 3. 성적이 60점 이상이면 합격생이다.
         * ---------------------------------------
         * . 전교생(10명)의 총점과 평균을 출력한다.
         * . 합격자 수를 출력한다.
         * . 1등 학생의 번호와 성적을 출력한다.
         *
         */

        Random rand = new Random();
        int[] arr = new int[10];
        int count = 0;
        int total = 0;
        int temp = 0;
        int tempIndex = 0;


        for(int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100)+1;
            total += arr[i];
            if(arr[i] >= 60) {
                count++;
            }
            if(temp < arr[i]) {
                temp = arr[i];
                tempIndex = i;
            }
        }
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/10);
        System.out.println("합격자 수 : " + count);
        System.out.println("1등 점수 : " + temp);
        System.out.println("1등 번호 : " + (tempIndex+1));
        System.out.println("전체 학생 성적" + Arrays.toString(arr));
    }
}
