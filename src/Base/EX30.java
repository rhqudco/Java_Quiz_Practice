package Base;

import java.util.Arrays;

public class EX30 {
    public static void main(String[] args) {
        int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
        int[] scores  = {  87,   11,   45,   98,   23};
        int maxsc = 0;
        int maxid = 0;
        // 문제) 1등학생의 학번과 성적 출력
        // 정답) 1004번(98점)
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > maxsc) {
                maxsc = scores[i];
                maxid = hakbuns[i];
            }
        }
        System.out.println(maxid + "번" + "(" + maxsc + "점)");
    }
}
