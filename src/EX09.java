import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        /*
         * # 영수증 출력[1단계]
         *
         * 1. 메뉴판을 출력한다.
         * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
         * 3. 현금을 입력받는다.
         * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
         * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
         *
         */
        int price1 = 8700;
        int price2 = 6200;
        int price3 = 1500;

        int bul = 1;
        int sae = 2;
        int col = 3;

        System.out.println("=== 롯데리아 ===");
        System.out.println("1.불고기 버거 : " + price1 + "원");
        System.out.println("2.새우  버거 : " + price2 + "원");
        System.out.println("3.콜     라 : " + price3 + "원");
        Scanner scan = new Scanner(System.in);
        System.out.println("주문하시려는 메뉴를 입력해 주세요.(숫자)");
        int choice = scan.nextInt();
        if(choice > 3) {
            System.out.println("잘못 입력했습니다.");
            return;
        }
        System.out.println("갖고 있는 현금은 얼마 입니까?");
        int cash = scan.nextInt();

         if(choice == 1) {
            if(cash >= price1) {
                System.out.println("영수중 : 주문 완료!");
                System.out.println("거스름돈 = " + (cash-price1));
            }
            else {
                System.out.println("현금이 부족하여 주문 실패");
            }
        }
        else if(choice == 2) {
            if(cash >= price2) {
                System.out.println("영수중 : 주문 완료!");
                System.out.println("거스름돈 = " + (cash-price2));
            }
            else {
                System.out.println("현금이 부족하여 주문 실패");
            }
        }
        else if(choice == 3) {
            if(cash >= price3) {
                System.out.println("영수중 : 주문 완료!");
                System.out.println("거스름돈 = " + (cash-price3));
            }
            else {
                System.out.println("현금이 부족하여 주문 실패");
            }
        }
    }
}
