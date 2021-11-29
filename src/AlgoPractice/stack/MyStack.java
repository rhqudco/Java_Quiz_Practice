package AlgoPractice.stack;

public class MyStack {
    // 멤버 변수
    private int stackSize; // 스택 크기
    private int top; // 스택 포인터
    private char[] stackArr; // 스택(배열 변수만 선언하고 할당, 크기 설정 안됨)

    // 생성자
    public MyStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize; // 스택 크기만 설정
        stackArr = new char[this.stackSize]; // 스택 배열 생성
    }

    // 메서드
    // 스택이 비었는지 isEmpty() 결과는 true(비었을 때) / false(가득  찼을 때)로 반환
    public boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }
    // 스택이 차있는지 isFull() 결과는 true(가득 찼을 때) / false(가득 아닐 때)로 반환
    public boolean isFull() {
        if(top == stackSize-1) return true;
        else return false;
    }
    // 스택에 데이터를 삽입하는 push()
    // 1. 삽입 전 overflow 발생하는지 확인
    // 2. overflow가 아니면 삽입 push 시작
    // 3. top 위치 확인 후 top+1(++top)에 삽입
    // 삽입을 위한 매개변수를 받고 반환 값은 없다.
    public void push(char input) {
        if(isFull()) {
            System.out.println("Stack is Full\nOverFlow!!!\npush Failed");
        }
        else {
            // push 할 때 먼저 1증가
            stackArr[++top] = input;
        }
    }
    // 스택에 데이터를 삭제하는 pop()
    // 1. 데이터 삭제 전 underflow 검사
    // 2. underflow가 아니면 데이터 삭제
    // 3. top 위치 확인 후 top위치 삭제 후 top-1
    // 삭제한 문자를 반환
    public char pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty\nUnderFlow!!!\npop Failed");
            return 'E'; // 형식적인 반환 값
        }
        else {
            return stackArr[top--];
        }
    }
    // 스택의 최상위 데이터 출력하는 peek()
    // 1. 스택에 값이 있는지 확인 isEmpty()
    // 2. 최상위 데이터(top위치) 리턴
    public char peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty \n ");
            return 'E'; // 형식적인 반환 값
        }
        else {
            return stackArr[top];
        }
    }
    //  스택을 비우는 clear()
    // 1. top = -1로
    // 2. stack 값 모두 삭제
    public void clear() {
        top = -1;
    }
    // 스택의 전체 데이터를 출력하는 showStack()
    // 출룍먼 하고 반환 값은 없다
    // 1. 출력 전 비었는지 확인(반환 값 없음)
    // 2. 스택 모든 요소 값 출력
    public void showStack() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            System.out.print("Stack Items : ");
            for(int i = 0; i <= top; i++) {
                System.out.print(i + ":" + stackArr[i] + " ");
            }
            System.out.println("\ntop : " + top);
            System.out.println("top index is " + stackArr[top]);
        }
    }
}
