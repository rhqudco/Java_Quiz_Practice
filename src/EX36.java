import java.util.Arrays;
import java.util.Scanner;

public class EX36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 0};
        int cnt = 2;
        while (true) {
            int temp = 0;
            System.out.print("삽입할 값을 입력해 주세요 : ");
            int ins = scan.nextInt();
            System.out.print("삽입할 위치를 입력해 주세요 : ");
            int idx = scan.nextInt();

            for(int i = arr.length-1; i > idx; i--) {
                arr[i] = arr[i-1];
            }
            arr[idx] = ins;
            System.out.println(Arrays.toString(arr));
        }
    }
}
