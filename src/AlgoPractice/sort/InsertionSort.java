package AlgoPractice.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {8,5,4,6,3,1,2,7,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertSort(int[] arr) {
        for(int i = 1; i<arr.length; i++) {
            // 선택한 값
            int temp = arr[i];
            // 선택한 값의 이전 원소의 인덱스 번호 저장
            int index = i - 1;
            // 현재 값이 이전 원소보다 작으면 큰 값은 뒤로 이동
            while (index >= 0 && temp < arr[index]) {
                // 이전 원소를 한 칸씩 뒤로 이동
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = temp;
        }
    }
}
