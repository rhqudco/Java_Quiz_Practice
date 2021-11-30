package AlgoPractice.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add("고병채 만세");

        System.out.println();
        System.out.println("전체 내용 출력");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + " : " + list.get(i));
        }
        System.out.println();
        System.out.println("전체 내용 출력 2");
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("네 번째 요소 출력 : " + list.get(3));
        System.out.println("네 번째 요소 길이 : " + list.get(3).length()); // 한글도 한 글자당 1개 취급(공백도 1개 취급)

        // 2번 인덱스 위치(세 번째)에 삽입
        list.add(2,"Spring");
        // 총 객체 수 출력
        System.out.println();
        System.out.println("총 객체 수 : " + list.size());
        // 전체 내용 출력
        System.out.println();
        System.out.println("전체 내용 출력 3");
        for(String item : list) {
            System.out.println(item);
        }
        // JDBC 제거
        System.out.println();
        System.out.println("JDBC 제거");
        list.remove("JDBC");
        // Java포함 여부
        System.out.println();
        System.out.println("Java 포함 여부");
        System.out.println(list.contains("Java"));
    }
}
