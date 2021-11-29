package AlgoPractice.queue;

public class MyQueueMoveMain {
    public static void main(String[] args) {
        int queueSize = 5;
        MyQueueMove myQueueMove = new MyQueueMove(queueSize);

        myQueueMove.showQueue();
        System.out.println("데이터 : " + myQueueMove.numOfData() + "개");

        System.out.println();
        System.out.println("a, b, c enQueue");
        myQueueMove.enQueue('a');
        myQueueMove.enQueue('b');
        myQueueMove.enQueue('c');
        myQueueMove.showQueue();
        System.out.println();
        System.out.println("데이터 : " + myQueueMove.numOfData() + "개");

        System.out.println();
        System.out.println("peek() 수행(첫 번째 값) = " + myQueueMove.peek());

        System.out.println();
        System.out.println("deQueue 수행");
        System.out.println("삭제된 값 : " + myQueueMove.deQueue());
        myQueueMove.showQueue();
        System.out.println();
        System.out.println("데이터 : " + myQueueMove.numOfData() + "개");

        System.out.println();
        System.out.println("peek() 수행(첫 번째 값) = " + myQueueMove.peek());

        System.out.println();
        System.out.println("d, e enQueue");
        myQueueMove.enQueue('d');
        myQueueMove.enQueue('e');
        myQueueMove.showQueue();
        System.out.println("데이터 : " + myQueueMove.numOfData() + "개");

        // 현재 큐 상태 : 0은 비었고, 1~4까지 4개 데이터가 들어 있음
        // 큐 이동 없는 경우
//		System.out.println("\nf enqueue 수행");
//		q.enqueue('f');   // Queue Full!
//		q.showQueue();    // Queue items : 1:b 2:c 3:d 4:e
//		System.out.println("\n데이터 : " + q.numOfData()); // 데이터 : 4

        // 앞 공간이 비었더라도 rear가 stackSize(인덱스 4, 5개)와 동일하면 오버플로우 발생
        // --> 해결1 : 이동 큐, 해결2 : 원형 규

        // 이동 큐
        System.out.println("\nf enQueue 수행");
        myQueueMove.enQueue('f');   // 큐 이동 발생
        myQueueMove.showQueue();    // Queue items : 0:b 1:c 2:d 3:e 4:f
        System.out.println("\n데이터 : " + myQueueMove.numOfData()); // 데이터 : 5

        System.out.println("\ng enQueue 수행");
        myQueueMove.enQueue('g'); // Queue Full!
        myQueueMove.showQueue();  // Queue items : 0:b 1:c 2:d 3:e 4:f

        System.out.println("\ndeQueue 수행");
        System.out.println("삭제된 값 : " + myQueueMove.deQueue()); // 삭제된 값 :b
        myQueueMove.showQueue();  // Queue items : 1:c 2:d 3:e 4:f

        System.out.println("\nclear 수행 ");
        myQueueMove.clear();
        myQueueMove.showQueue(); // Queue Empty

        System.out.println("\nh enQueue 수행");
        myQueueMove.enQueue('h'); // Queue Full!
        myQueueMove.showQueue(); // Queue items : 0:h
    }
}
