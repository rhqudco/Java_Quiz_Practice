package StringPractice;

public class String01 {
    public static void main(String[] args) {
        String jumin = "890101-2012932";
        // 문제 1 나이 출력
        int age = 0;
        age = Integer.parseInt(jumin.substring(0, 2));
        int cage = 1900 + age;
        int rage = 2021 - cage + 1;
        System.out.println("나이는 " + rage + "살 입니다.");


        // 문제 2 성별 출력
        int gender = Integer.parseInt(jumin.substring(7, 8));
        if(gender == 2) {
            System.out.println("female");
        }
        else if(gender == 1) {
            System.out.println("male");
        }
    }
}
