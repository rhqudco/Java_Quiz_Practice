package StringPractice;

import java.util.Arrays;

public class String02 {
    public static void main(String[] args) {
        String str = "11/100/89";
        // 문제 1 arr 배열에 각 점수를 저장하고 총점 출력
        int sum = 0;
        int[] arr = new int[3];
        String[] sarr = str.split("/");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);
            sum += arr[i];
        }
        System.out.println(sum);

        // 문제 2 score 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
        int[] scores = {11, 100, 89};
        String[] sc = new String[scores.length];
        for(int i = 0; i < scores.length; i++) {
            sc[i] = Integer.toString(scores[i]);
        }
        String text = String.join("/", sc);
        System.out.println(text);

    }
}
