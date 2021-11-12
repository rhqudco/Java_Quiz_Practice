package StringPractice;

import java.util.Arrays;
import java.util.Collections;

public class String05 {
    public static void main(String[] args) {
        // 문제 사전순으로 정렬
        String[] name = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }
}
