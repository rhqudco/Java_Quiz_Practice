package AlgoPractice.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String >();

        System.out.println("데이터 3개 삽입");
        deque.add("사과");
        System.out.println(deque);
        deque.add("딸기");
        System.out.println(deque);
        deque.add("망고");
        System.out.println(deque);
        deque.offer("수박");
        System.out.println(deque); // [사과, 딸기, 망고, 수박]

        System.out.println();
        System.out.println("앞쪽에 삽입");
        deque.addFirst("배");
        System.out.println(deque); // [배, 사과, 딸기, 망고, 수박]

        System.out.println();
        System.out.println("그냥 삽입");
        deque.add("용과");
        System.out.println(deque); // [배, 사과, 딸기, 망고, 수박, 용과]

        System.out.println();
        System.out.println("뒤쪽에 삽입");
        deque.addLast("용과"); // add랑 비슷하게 들어감 / 똑같은 값 삽입 가능
        System.out.println(deque); // [배, 사과, 딸기, 망고, 수박, 용과, 포도]

        System.out.println();
        System.out.println("peek 수행 : " + deque.peek());
        System.out.println("deQue 사이즈 : " + deque.size());

        System.out.println();
        System.out.println("순회");
        for (String item : deque) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("데이터 꺼내기");
        System.out.println("remove : " + deque.remove());
        System.out.println(deque);

        System.out.println();
        System.out.println("찾아서 삭제");
        System.out.println("사과 remove : " + deque.remove("사과")); // true
        System.out.println(deque);

        System.out.println();
        System.out.println("찾아서 삭제");
        System.out.println("코코넛 remove : " + deque.remove("코코넛")); // false
        System.out.println(deque);

        System.out.println();
        System.out.println("앞쪽에 삽입");
        deque.addFirst("용과");
        System.out.println(deque);

        System.out.println();
        System.out.println("찾아서 삭제");
        System.out.println("용과 remove : " + deque.remove("용과")); // true
        System.out.println(deque);
        // [용과, 딸기, 망고, 수박, 용과, 용과] -> [딸기, 망고, 수박, 용과, 용과]

        System.out.println();
        System.out.println("remove All : " + deque.removeAll(deque)); // 전체 삭제
        System.out.println(deque);

        System.out.println();
        System.out.println("데이터 3개 삽입");
        deque.add("사과");
        System.out.println(deque);
        deque.add("딸기");
        System.out.println(deque);
        deque.add("망고");
        System.out.println(deque);
        deque.offer("수박");
        System.out.println(deque); // [사과, 딸기, 망고, 수박]

        System.out.println();
        System.out.println("poll : " + deque.poll()); // 맨 앞에 있는 값 삭제
        System.out.println(deque); // [딸기, 망고, 수박]

        System.out.println();
        System.out.println("pollFirst : " + deque.pollFirst());
        System.out.println(deque); // [망고, 수박]

        System.out.println();
        System.out.println("pollLast : " + deque.pollLast());
        System.out.println(deque); // [망고]

        // deQue를 Stack처럼 사용
        System.out.println();
        System.out.println("push 수행");
        deque.push("밤"); // addFirst와 동일
        deque.push("밤");
        System.out.println(deque);

        System.out.println();
        System.out.println("pop 수행 : " + deque.pop()); // 맨 앞 삭제
        System.out.println(deque);
    }
}
