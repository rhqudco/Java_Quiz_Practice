package Class_Practice;

import java.util.Scanner;

// 사람을 모델로 클래스 정의
class Person {
    private int age;

    public Person(int initialAge) {
        this.age = initialAge;
    }
    public void amIOld() {
        if(this.age  < 10) {System.out.println("어리군요");}
        else if (this.age >= 10 && this.age < 20){System.out.println("10대군요");}
        else  {System.out.println("나이가 많으시네요");}
    }
    public void yearPasses() {
        this.age++;
    }
}

public class ClassvsInstence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for(int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
    }
}
