import java.util.Arrays;

public class EX26 {
    public static void main(String[] args) {
        // 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
        // 정답1) 10 20 30 40 50
        System.out.println("문제 1번");
        int[] arr_1 = new int[5];
        for(int i = 0; i < 5; i++) {
            arr_1[i] = (i+1)*10;
        }
        System.out.println(Arrays.toString(arr_1));

        // 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
        // 정답2) 20 40
        System.out.println("문제 2번");
        int[] arr_2 = new int[5];
        for(int i = 0; i < 5; i++) {
            arr_2[i] = (i+1)*10;
            if(arr_2[i]%4 == 0) {
                System.out.println(arr_2[i]);
            }
        }


        // 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
        // 정답3) 60
        System.out.println("문제 3번");
        int[] arr_3 = new int[5];
        int temp = 0;
        for(int i = 0; i < 5; i++) {
            arr_3[i] = (i+1)*10;
            if(arr_3[i]%4 == 0) {
                temp += arr_3[i];
            }
        }
        System.out.println(temp);

        // 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
        // 정답4) 2
        System.out.println("문제 4번");
        int[] arr_4 = new int[5];
        int count = 0;
        for(int i = 0; i < 5; i++) {
            arr_4[i] = (i+1)*10;
            if(arr_4[i]%4 == 0) {
                count++;
            }
        }
        System.out.println(count);

        // 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
        // 정답5) 5
        System.out.println("문제 4번");
        int[] arr_5 = new int[5];
        int cnt = 0;
        for(int i = 0; i < 5; i++) {
            arr_5[i] = (i+1)*10;
            if(arr_5[i]%2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
