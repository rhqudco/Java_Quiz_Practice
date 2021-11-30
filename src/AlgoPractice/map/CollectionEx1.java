package AlgoPractice.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("트랜스포머");
        list.add("스타워즈");
        list.add("매트릭스");
        list.add("터미네이터");
        list.add("아바타");

        System.out.print("리스트 순서 : ");
        for(String movie : list) {
            System.out.print(movie + " | ");
        }
        System.out.println();
        System.out.print("오름차순 정렬 : ");
        Collections.sort(list);
        printList(list);

        System.out.println();
        int index = Collections.binarySearch(list, "스타워즈");
        System.out.println("스타워즈는 " + index + " 번 인덱스 입니다.");

        System.out.println();
        System.out.print("내림차순 정렬 : ");
        Collections.reverse(list);
        printList(list);
    }
    static void printList(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String element = it.next();
            String sep;
            if(it.hasNext()) {
                sep = " -> ";
            }
            else {
                sep = "\n";
            }
            System.out.print(element + sep);
        }
    }
}
