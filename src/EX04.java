import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        /*
         * # 로그인[2단계]
         *
         * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
         * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
         * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
         * 예) 로그인 성공 or 로그인 실패
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("회원 가입을 해주세요.");
        System.out.println("회원 가입할 아이디를 입력해 주세요.");
        int dbid = scan.nextInt();;
        System.out.println("회원 가입할 패스워드를 입력해 주세요.");
        int dbpw = scan.nextInt();

        System.out.println("로그인을 합니다. 아이디 패스워드를 입력해 주세요.");
        int id = scan.nextInt();
        int pw = scan.nextInt();
        if(dbid == id && dbpw == pw) {
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }
    }
}
