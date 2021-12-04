package AlgoPractice.recursive;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int f = scan.nextInt();
        System.out.print(f + "! = ");
        System.out.println("1 = " + factorial(f));
    }
    static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        else {
            System.out.print(num + " * ");
            return num * factorial(num - 1);
        }
    }
}