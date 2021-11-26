package AlgoPractice;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("원판 개수 입력 : ");
        int num = scan.nextInt();
        tower(1, 2, 3, num);
    }
    static void tower(int tower1, int tower2, int tower3, int n){ // tower1 -> tower3로 원판 이동
        //System.out.printf("[tower1 : %d] [tower2 : %d] [tower3 : %d] [n : %d]\n", tower1, tower2, tower3, n);
        if(n == 0) {
            return;
        }
        tower(tower1, tower3, tower2 ,n-1); // 원판  n-1을 tower1 -> tower3으로 이등
        System.out.printf("원판 [%d](를)을 기둥[%d]에서 기둥[%d](으)로 이동\n", n, tower1, tower3);
        tower(tower2, tower1, tower3, n-1); // 원판 n-1을 tower2 -> tower3으로 이동
    }
}
