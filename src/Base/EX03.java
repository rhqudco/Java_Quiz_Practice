package Base;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        /*
         * # 로그인[1단계]
         *
         * 1. Id와 Pw를 입력받는다.
         * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
         * 예) 로그인 성공 or 로그인 실패
         */
        Scanner scan = new Scanner(System.in);
        int dbid = 1234;
        int dbpw = 1111;
        System.out.println("아이디 입력하세요");
        int id = scan.nextInt();
        System.out.println("비밀번호 입력하세요");
        int pw = scan.nextInt();
        if(dbid == id && dbpw == pw) {
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }
    }
}
