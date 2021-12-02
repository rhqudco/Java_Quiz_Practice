package AlgoPractice.sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortHomeW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int students = scan.nextInt();
        int[] arr = new int[students];

        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print("학생 " + (i+1) + " 점수 입력 : ");
            arr[i] = scan.nextInt();
        }

        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("성적 순으로 정렬");
        for(int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + "등 : " + arr[i]);
        }
    }
    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int pivot = low;
        int i = low + 1;
        int j = high;
        int temp;
        while(i <= j) { // 교차할 때 까지 반복 j가 i보다 크면 while문 종료
            while(i <= high && arr[i] > arr[pivot]) { // 피벗보다 큰 값을 만날 때 까지 반복
                i++;
            }
            while (j > low && arr[j] <= arr[pivot]) { // 피벗보다 작은 값을 만날 때 까지 반복
                j--;
            }
            if(i > j) { // 교차한 상태가 되면 피복과 j 교환
                temp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = temp;
            }
            else { // i와 j값 교환
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }
}