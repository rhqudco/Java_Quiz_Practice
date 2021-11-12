package Base;

import java.util.Arrays;

public class EX31 {
    public static void main(String[] args) {
        /*
         * # 4의 배수만 저장
         *
         *   arr 배열에서 4의 배수의 개수를 계산하여 4의 배수의 개수만큼  temp 배열을 생성한뒤에
         *   arr배열의 4의 배수들을  temp로 옮겨담아보시오.
         *
         */
        int[] arr = {44, 11, 29, 24, 76};
        int[] temp = null;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 4 == 0) {
                cnt++;
            }
        }
        int j = 0;
        temp = new int[cnt];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 4 == 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
