package AlgoPractice.map;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        // 갹체 저장
        map.put("홍길동", 85);
        map.put("이몽룡", 90);
        map.put("홍길동", 80);
        map.put("성춘향", 95);
        System.out.println("총 Entry 수 : " + map.size()); // 총 Entry 수 : 3
        System.out.println(map); // {성춘향=95, 홍길동=80, 이몽룡=90}
        System.out.println(map.get("홍길동")); // 80 (Key 홍길동의 Value 출력
        System.out.println(map.keySet()); // [성춘향, 홍길동, 이몽룡] Key 값만 출력됨
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
//        성춘향 : 95
//        홍길동 : 80
//        이몽룡 : 90
        map.remove("홍길동", 85); // 홍길동은 80인데 85를 넣으면 지워지지 않음
        System.out.println("총 Entry 수 : " + map.size()); // 총 Entry 수 : 3

        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size()); // 총 Entry 수 : 2

        map.clear();
        System.out.println("총 Entry 수 : " + map.size()); // 총 Entry 수 : 0
    }
}
