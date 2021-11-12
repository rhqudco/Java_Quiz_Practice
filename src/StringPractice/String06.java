package StringPractice;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        // 문자열 속 숫자 검사
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");

        String text = scan.next();

        int numcnt = 0;
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch >= 0x30 && ch <=0x39) {
                numcnt++;
            }
        }
        if(numcnt == 0) System.out.println("only text");
        else if ((numcnt == text.length())) System.out.println("only num");
        else System.out.println("mixed");
    }
}