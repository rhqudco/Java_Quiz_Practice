package AlgoPractice.queue;

public class MyQueueMain {
    public static void main(String[] args) {
        int queueSize = 5;
        MyQueue myQueue = new MyQueue(queueSize);

        myQueue.showQueue();
        System.out.println("데이터 : " + myQueue.numOfDate() + "개");

        System.out.println();
        System.out.println("a, b, c enQueue");
        myQueue.enQueue('a');
        myQueue.enQueue('b');
        myQueue.enQueue('c');
        myQueue.showQueue();
        System.out.println();
        System.out.println("데이터 : " + myQueue.numOfDate() + "개");

        System.out.println();
        System.out.println("peek() 수행(첫 번째 값) = " + myQueue.peek());

        System.out.println();
        System.out.println("deQueue 수행");
        System.out.println("삭제된 값 : " + myQueue.deQueue());
        myQueue.showQueue();
        System.out.println();
        System.out.println("데이터 : " + myQueue.numOfDate() + "개");

        System.out.println();
        System.out.println("peek() 수행(첫 번째 값) = " + myQueue.peek());

        System.out.println();
        System.out.println("d, e enQueue");
        myQueue.enQueue('d');
        myQueue.enQueue('e');
        myQueue.showQueue();
        System.out.println("데이터 : " + myQueue.numOfDate() + "개");

        // 0은 비었고 1~4까지 데이터 4개 있음
        System.out.println();
        System.out.println("f enQueue");
        myQueue.enQueue('f');
        myQueue.showQueue();
        System.out.println("데이터 : " + myQueue.numOfDate() + "개");
        // 앞 공간이 비었어도 rear가 QueueSize와 동일하기 때문에 가득 찼다고 오류 발

        System.out.println();
        System.out.println("clear() 수행");
        myQueue.clear();
        myQueue.showQueue(); // Empty

        myQueue.enQueue('g');
        myQueue.showQueue();
    }
}
