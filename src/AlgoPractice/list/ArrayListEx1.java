package AlgoPractice.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List list = new ArrayList(5);

        list.add(100);
        list.add(2.55);
        list.add(300);
        list.add(9.9);
        list.add("자바 프로그래밍");
        list.add(1, "데이터베이스"); // 1번 index부터 뒤로 한 칸씩 밀고 1번에 삽입

        System.out.println("리스트 내용 출력");
        for(int i = 0; i <list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
        System.out.println();
        System.out.println("포함 여부 확인");
        System.out.println(list.contains(300)); // trye
        System.out.println(list.contains("자바")); // false

        System.out.println();
        System.out.println("리스트에서 데이터 삭제");
        System.out.println(list.remove(1)); // 1번 인덱스 삭제
        System.out.println(list.remove("자바 프로그래밍")); // 값이 들어있는 인덱스 삭제

        System.out.println();
        System.out.println("리스트 내용 출력");
        for(int i = 0; i <list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
    }
}
