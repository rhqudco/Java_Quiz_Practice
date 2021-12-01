package AlgoPractice.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,2,8,3,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        // 이전 값을 뒤에 넣기 위해 임시 저장소 필요
        int temp = 0;
        // 총 라운드 : 배열 크기 - 1번
        for(int i = 0; i < arr.length; i++) {
            // 각 라운드별 비교 횟수 : 배열크기 - 라운드 횟수
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
