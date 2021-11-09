package Class_Practice;

import java.util.Arrays;

class Ex02  {
    void test1(int x, int y) {
        int temp = 0;
        for(int i = x; i <= y; i++) {
            temp += i;
        }
        System.out.println(temp);
    }
    void test2(int[] arr) {
        int a = 0;
        for(int i = 0; i < arr.length; i++) {
            if(a < arr[i]) {
                a = arr[i];
            }
        }
        System.out.println(a);
    }
    void test3(int[] arr, int idx1, int idx2) {
        int temp = 0;
        temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

public class Method02 {
    public static void main(String[] args) {

            Ex02 e = new Ex02();

            // 문제 1) x부터 y까지의 합을 출력하는 메서드
            int x = 1;
            int y = 10;
            e.test1(x, y);

            // 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
            int[] arr = {87, 100, 35, 12, 46};
            e.test2(arr);

            // 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
            int idx1 = 1;
            int idx2 = 4;
            e.test3(arr, idx1, idx2);

    }
}
