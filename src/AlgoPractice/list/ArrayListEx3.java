package AlgoPractice.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        String str = "";

        for(int i = 0; i < 4; i++) {
            System.out.print("단어 입력 : ");
            list.add(scan.nextLine());
        }
        System.out.println("---------------------------------------------");
        System.out.print("단어 리스트 : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            if (temp < list.get(i).length()) {
                temp = list.get(i).length();
                str = list.get(i);
            }
        }
        System.out.println("\n가장 긴 단어 : " + str);
        System.out.println("가장 긴 단어 길이 : " + temp);
    }
}
