package AlgoPractice.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        // 중복 값은 한 번만 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("MyBatis");

        System.out.println("총 객체 수 : " + set.size()); // 총 객체 수 : 4
        System.out.println();
        Iterator<String> iterator = set.iterator(); // 전체 객체를 대상으로 한 번씩 반복해 가져오는 반복자
        while (iterator.hasNext()) { // 들어있는 객체 수 만큼 반복
            System.out.println(iterator.next());
        }
//        Java
//        JDBC
//        MyBatis
//        Servlet/JSP

        System.out.println();
        set.remove("JDBC");
        set.remove("MyBatis");
        for(String element : set) {
            System.out.println(element);
        }
//        Java
//        Servlet/JSP

        System.out.println();
        set.clear();
        if(set.isEmpty()) {
            System.out.println("비어 있음");
        }
        // 비어 있음음
    }
}
