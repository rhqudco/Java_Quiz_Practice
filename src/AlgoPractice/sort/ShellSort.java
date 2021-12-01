package AlgoPractice.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int [] arr = {30,60,90,10,40,80,40,20,10,60,50,30,40,90,80};
        shellSort(arr);
        System.out.println("최종");
        System.out.println(Arrays.toString(arr));
    }
    static void shellSort(int[] arr) {
        int n = arr.length;
        for(int i = n/2; i > 0; i/=2) {
            System.out.println("간격 i = " + i);
            for(int j = i; j < n; j++) { // 삽입 정렬을 위해 서브 리스트의 두 번째 값을 가지고 비교
                int index = j - i;
                int temp = arr[j];
                // 삽입 정렬 수행
                while (index >= 0 && arr[index] > temp) {
                    arr[index+i] = arr[index];
                    index -= i;
                }
                arr[index + i] = temp;
            }
            // 각 간격마다 정렬 결과
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }
}
