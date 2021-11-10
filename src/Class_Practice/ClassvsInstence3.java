package Class_Practice;

import java.util.Random;
import java.util.Scanner;

// 은행 모델로 클래스 설계
class Account {
    int cash;
    int accountNumber;
}
class User{
    String id;
    String accountNumber;
    int cash;

    User() {
        this.accountNumber = createAccountNumber();
        this.cash = 0;
    }
    // 생성자 오버로딩
    // 이름은 같고, 매개변수(개수 or 타입)는 달라야 한다.
    User(int cashInput) {
        this.accountNumber = createAccountNumber();
        this.cash = cashInput;
    }

    protected String createAccountNumber() {
        Random rand = new Random();
        String account = String.format("%03d-%04d-%04d-%02d", rand.nextInt(899)+100,
                rand.nextInt(9999)+1,
                rand.nextInt(9999)+1,
                rand.nextInt(99)+1);
        return account;
    }

    void printId() {
        System.out.println("고객 ID : " + id);
    }
    void printAccount() {
        System.out.println("계좌번호 : " + this.accountNumber + " 잔액 : " + this.cash);
    }
    void deposit(int cashInput) {
        this.cash += cashInput;
    }
    void withdraw(int cashOutput) {
        if(this.cash < cashOutput) {
            System.out.println("잔액이 부족합니다.");
        }
        else {
            this.cash -= cashOutput;
        }
    }
}
// User의 기능 확장
class UserCredit extends User {
    int creditLv = 0;
    int depositCnt = 0;

    // 오버라이딩 아님
    // 생성자 재정의
    UserCredit(int cashInput) {
        super(cashInput);
    }
    UserCredit() {
        super();
    }

    // 메소드 오버라이딩
    // 입금횟수 따라 신용등급 올려준다.
    void deposit(int cashInput) {
        super.deposit(cashInput);
        this.depositCnt++;
        if(this.depositCnt % 5 == 0) creditLv++;
    }

    void withdraw(int cashOutput) {
        if(this.creditLv >= 10 && this.cash < cashOutput) this.cash -= cashOutput;
        else if(this.creditLv <= 10 && this.cash < cashOutput) System.out.println("잔액 부족이니까 돌아가");
        else cash -= cashOutput;
    }

    @Override
    void printAccount() {
        super.printAccount();
        System.out.println("신용등급 : " + creditLv + " 입금횟수 : " + depositCnt);
    }
}

public class ClassvsInstence3 {
    public static void main(String[] args) {

        Random rand = new Random();

        // 생성자를  통해 고객 객체가 생성될 때 마다 계좌번호 자동 부여
        // 계좌 생성해서 부여
        // 가입할 때 입금액이 있는 경우를 위한 생성자

        /*User user01 = new User();
        User user02 = new User();
        User user03 = new User();
        User user04 = new User();*/

        // 배열을 사용해서 고객 객체를 저장할 수 있는 메모리 공간 확보
        User[] userList = new User[5];
        // 해당 메모리에 고객 객체 저장
        /*userList[1] = user01;
        userList[2] = user02;
        userList[3] = user03;
        userList[4] = user04;*/
        for(int i  = 1; i < userList.length; i++) {
            userList[i] = new User(rand.nextInt(99999));
            userList[i].printAccount();
        }
        System.out.println();
        userList[1].deposit(10000);
        userList[1].printAccount();
        userList[2].withdraw(100000);
        userList[2].printAccount();
        System.out.println();

        UserCredit userCredit01 = new UserCredit(12);
        userCredit01.printAccount();
        for(int i = 0; i < 120; i++) {
            userCredit01.deposit(rand.nextInt(100)+1);
        }
        userCredit01.printAccount();
        userCredit01.withdraw(10000);
        userCredit01.printAccount();
    }
}
