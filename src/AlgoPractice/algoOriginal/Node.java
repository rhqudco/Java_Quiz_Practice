package AlgoPractice.algoOriginal;

public class Node {
    int value;
    String name;
    Node leftchild;
    Node rightchild;

    // 생성자
    public Node(int value, String name) {
        this.value = value;
        this.name =  name;
        leftchild = null; // 객체이므로 null로 초기화
        rightchild = null;
    }
}
