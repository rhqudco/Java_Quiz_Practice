package AlgoPractice.queue;

// 앞이 비었는데도 오버플로우 발생 : 이동 없음
public class MyQueue {
    // 멤버 변수
    private int queueSize; // 큐의 용량
    private int front; // front -> 전위 포인터
    private int rear; // rear -> 후위 포인터
    private int num; // 현재 데이터 수
    private char[] queue;

    // 생성자에서 초기화
    public MyQueue(int queueSize) {
        // 배열을 사용하므로 초기값 -1로 설정
        front = -1;
        rear = -1;
        num = 0;
        this.queueSize = queueSize;
        queue = new char[queueSize];
    }

    // 큐가 비어있는지 상태 확인 isEmpty() true / false 반환
    public boolean isEmpty()  {
        if(front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        else return false;
    }

    // 큐가 가득 차있는 상태 확인 isFull()
    public boolean isFull() {
        return rear == queueSize -1;
    }

    // 큐에 데이터 삽입 enQueue()
    // 1. Full인지 확인
    // 2. 데이터 삽입
    public void enQueue(char item) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            queue[++rear] = item;
            num++; // 데이터 수 증가
        }
    }

    // 큐에서 데이터 삭제 deQueue()
    // 1. Empty인지 확인
    // 2. 데이터 삭제
    // 3. 데이터 반환
    public char deQueue() {
        if(isEmpty()) {
            return 'E';
        }
        else {
            num--; // 데이터 수 감소
            front++;
            return queue[front];
        }
    }

    // 큐의 첫 번째 데이터 추출하는 peek()
    // 추출해서 반환
    public char peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!!! peek Failed");
            return 'E';
        }
        else {
            return queue[front+1];
        }
    }

    // 큐 초기화 하는 clear()
    public void clear() {
        front = -1;
        rear = -1;
        System.out.println("Clear!!!");
    }

    // 큐에 들어있는 모든 데이터 출력하는 showQueue()
    // 1. 비었는지 확인
    // 2. 큐애 있는 모든 데이터 출력
    public void showQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!!! showQueue Failed");
        }
        else {
            System.out.print("Queue items : ");
            for(int i = front+1; i <= rear; i++) { // front + 1 부터 rear까지
                System.out.print(i + ":" + queue[i] + " ");
            }
            System.out.println("\nFront = " + (front+1) + " Rear = " + rear);
        }
    }
    //  데이터의 갯수를 반환하는 numOfDate()
    public int numOfDate() {
        return num;
    }
}
