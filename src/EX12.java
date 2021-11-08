import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
        /*
         * # ATM[1단계] : 이체하기
         *
         * 1. 이체할 계좌번호를 입력받는다.
         * 2. 계좌번호가 일치하면,
         * 3. 이체할 금액을 입력받는다.
         * 4. 이체할 금액 <= myMoney    : 이체가능
         *             myMoney   - 이체할 금액
         *             yourMoney + 이체할 금액
         *    이체할 금액  > myMoney     : 이체불가
         */
        int accont = 1234;
        int mycash = 10000;
        int yourcash = 150000;
        Scanner scan = new Scanner(System.in);
        System.out.println("이체 할 계좌번호 입력");
        int checkacc = scan.nextInt();
        if(checkacc == accont) {
            System.out.println("이체할 금액을 입력 해 주세요.");
            int gocash = scan.nextInt();
            if(gocash > mycash) {
                System.out.println("잔액이 부족합니다.");
            }
            else {
                System.out.println("이체합니다");
                System.out.println("내 잔고는 " + (mycash-gocash) + "원 입니다.");
            }
        }
        else {
            System.out.println("계좌번호가 맞지 않습니다.");
        }
    }
}
