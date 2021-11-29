package AlgoPractice.stack;

public class MyStackMain {
    public static void main(String[] args) {
        int stackSize = 5; // 스택 크기
        MyStack myStack = new MyStack(stackSize);

        System.out.print("스택 초기 : ");
        myStack.showStack();

        System.out.println();
        System.out.println("pop 수행");
        myStack.pop();

        System.out.println();
        System.out.println("a, b, c push 수행");
        myStack.push('a');
        myStack.push('b');
        myStack.push('c');
        myStack.showStack();

        System.out.println();
        System.out.println("최상위 값 : " + myStack.peek());

        System.out.println();
        System.out.println("d, e, push 수행");
        myStack.push('d');
        myStack.push('e');
        myStack.showStack();

        System.out.println();
        System.out.println("f push 수행");
        myStack.push('f');

        System.out.println();
        System.out.println("pop 두 번 수행");
        System.out.println("pop 한 값 : " + myStack.pop());
        System.out.println("pop 한 값 : " + myStack.pop());
        myStack.showStack();

        System.out.println();
        System.out.println("clear 수행");
        myStack.clear();
        myStack.showStack();

        System.out.println();
        System.out.println("h push 수행");
        myStack.push('h');
        myStack.showStack();
    }
}
