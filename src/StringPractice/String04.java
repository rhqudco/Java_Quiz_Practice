package StringPractice;

import java.util.Arrays;

public class String04 {
    public static void main(String[] args) {
        //문제 이름과 성적을 하나의 문자열로 연결

        String[] name = {"김철수", "이만수", "이영희"};
        int [] score = {87, 42, 95};
        String str = "";
        for(int i = 0; i < 2; i++) {
            str = str + String.join("/", name[i],Integer.toString(score[i])) + ",";
        }
        str = str + String.join("/", name[2],Integer.toString(score[2]));
        System.out.println(str);
    }
}
