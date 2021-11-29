package AlgoPractice.stack;

import java.util.Stack;

public class UtilStack {
    public static void main(String[] args) {
        Stack<String> stk = new Stack<String>();

        stk.push("메시");
        stk.push("호날두");
        stk.push("고병채");

        for(int i =0; i<stk.size(); i++) {
            System.out.println(i + " : " + stk.get(i)); //get은 값만 출력(pop이 아님)
        }
        System.out.println();
        System.out.println("스택 크기 : " + stk.size());
        System.out.println("최상위 값 : " + stk.peek());

        System.out.println();
        System.out.println("호날두가 들어 있나? : " + stk.contains("호날두"));
        System.out.println("호날두가 들어 있나? : " + stk.contains("음바페"));

        System.out.println();
        System.out.println("pop 수행1 : " + stk.pop());
        System.out.println("pop 수행2 : " + stk.pop());
        for(int i =0; i<stk.size(); i++) {
            System.out.println(i + " : " + stk.get(i)); //get은 값만 출력(pop이 아님)
        }

        System.out.println();
        System.out.println("clear 수행");
        stk.clear();
        System.out.println("empty ? -> " + stk.empty());

        try {
            System.out.println();
            System.out.println("pop 수행3 : " + stk.pop());
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.toString());
        }
    }
}
