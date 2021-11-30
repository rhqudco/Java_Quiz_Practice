package AlgoPractice.map;

import java.lang.reflect.Array;
import java.util.HashMap;

public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<String, String[]> pNum = new HashMap<String, String[]>();
        pNum.put("친구1",
                new String[] {"010-1111-1111", "02-1111-1111", "friend1@google.com"});
        pNum.put("친구2",
                new String[] {"010-2222-2222", "02-2222-2222", "friend2@google.com"});
        pNum.put("친구3",
                new String[] {"010-3333-3333", "02-3333-3333", "friend2@google.com"});
        pNum.put("동기",
                new String[] {"010-4444-4444", "02-4444-4444", "sametime@google.com"});
        pNum.put("부장님",
                new String[] {"010-5555-5555", "02-5555-5555", "boss@google.com"});
        System.out.println("총 그룹 수 : " + pNum.size());

        // 모든 정보 조회
        for(String key : pNum.keySet()) {
            System.out.print(key + " : ");
//            String[] pList = pNum.get(key);
//            for(String one : pList) {
            for(String one : pNum.get(key)) {
                System.out.print(one + " | ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("\n동기 검색 : ");
        if(pNum.containsKey("동기")) {
            for(String one : pNum.get("동기")) {
                System.out.print(one + " | ");
            }
        }
        System.out.println();
        System.out.print("\n사장님 검색 : ");
        if(pNum.containsKey("사장님")) {
            for(String one : pNum.get("사장님")) {
                System.out.print(one + " | ");
            }
        } else {
            System.out.println("연락처 없음");
        }
    }
}
