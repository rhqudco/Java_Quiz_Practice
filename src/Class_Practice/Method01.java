package Class_Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex01 {
    void test1() {
        int tmp = 0;
        for(int i = 0; i < 5; i++) {
            tmp += i;
        }
        System.out.println(tmp);
    }
    void test2() {
        Random rand = new Random();
        int[] arr = new int[3];
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100)+1;
            if(tmp < arr[i])  {
                tmp = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(tmp);
    }
}
public class Method01 {
    public static void main(String[] args) {
        Ex01 e = new Ex01();

        // 문제 1) 1부터 5까지의 합을 출력하는 메서드
        e.test1();

        // 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
        e.test2();
    }
}
