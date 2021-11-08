import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        /*
         * # 놀이기구 이용제한
         *
         * 1. 키를 입력받는다.
         * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
         * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
         * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
         *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("키가 몇 cm입니까?");
        int height = scan.nextInt();
        if(height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("부모님이랑 같이 오셨나요?");
            System.out.println("같이 오셨으면 1번, 혼자 오셨으면 2번");
            int parent = scan.nextInt();
            if(parent == 1)  {
                System.out.println("탑승 가능");
            }
            else {
                System.out.println("탑승 불가능");
            }
        }
    }
}
