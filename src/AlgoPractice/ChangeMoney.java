package AlgoPractice;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int money = scan.nextInt();
        int money = 18793;
        int[] arr = {5000,1000,500,100,50,10};
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "원 : " + money / arr[i]);
            money %= arr[i];
        }
        System.out.println("남은 돈  : " + money + "원");
    }
}