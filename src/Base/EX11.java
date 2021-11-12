package Base;

import java.util.Random;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        /*
         * # 코인 게임
         *
         * 1. 0 또는 1의 랜덤 숫자를 저장한다.
         * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
         * 3. 동전의 앞뒷면을 맞추는 게임이다.
         *
         */
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int coin = rand.nextInt(2);

        System.out.println("insert coin : 0 or 1");
        int choice = scan.nextInt();
        if(choice == coin) {
            System.out.println("Good!");
            System.out.println("coin number is => " + coin);
        }
        else {
            System.out.println("Bad~!");
            System.out.println("coin number is => " + coin);
        }
    }
}
