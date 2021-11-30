package AlgoPractice.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetLotto {
    public static void main(String[] args) {
        // 중복 값 저장 하지 않는 특성 이욯하여 로또 번호 생성
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(; set.size() < 6;) {
            count++;
            int num = (int)(Math.random()*45) + 1;
            set.add(num);
            System.out.println(count);
        }
        System.out.println("Set");
        System.out.println(set);

        // LinkedList 생성되며 동시에 값 할당
        LinkedList<Integer> list = new LinkedList<Integer>(set);
        System.out.println("List");
        System.out.println(list);

        System.out.println("Reverse");
        Collections.reverse(list); // 반대 인덱스부터 출력
        System.out.println(list);

        System.out.println("Sorted List"); // 오룸차순 정렬
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Sorted List Reverse");
        Collections.reverse(list); // 정렬 후 사용하면 내림차순 정렬 가능
        System.out.println(list);
    }
}
