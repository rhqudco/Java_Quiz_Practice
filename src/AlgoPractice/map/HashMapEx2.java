package AlgoPractice.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        Scanner scan = new Scanner(System.in);
        map.put("apple", "사과");
        map.put("summer", "여름");
        map.put("school", "학교");
        map.put("bus", "버스");
        map.put("water", "물");
        while (true) {
            System.out.print("찾고 싶은 단어는? ");
            String str = scan.next();
            if(str.equals("exit")) {
                System.out.println("종료합니다");
                System.exit(0);
            }
            else {
                if(map.keySet().contains(str)) {
                    System.out.println(map.get(str));
                }
                else {
                    System.out.println("없는 단어 입니다.");
                }
            }
        }
    }
}
