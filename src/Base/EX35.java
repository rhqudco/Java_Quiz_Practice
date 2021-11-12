package Base;

import java.util.Arrays;
import java.util.Scanner;

public class EX35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 0};
        int cnt = 2;
        while (true) {
                int temp = 0;
                System.out.print("삭제할 값을 입력해 주세요 : ");
                int del = scan.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == del) {
                        temp = i;
                    }
                }
            for(int j = temp; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
