package AlgoPractice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("항의 개수 입력 : ");
        int fib = scan.nextInt();
        for (int i = 1; i <= fib; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    static int fibonacci(int num) {
        if(num == 1 || num == 2) {
            return 1;
        }
        else {
            return fibonacci(num - 2) + fibonacci(num - 1);
        }
    }
}
