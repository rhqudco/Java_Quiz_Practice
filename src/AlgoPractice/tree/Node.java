package AlgoPractice.tree;

public class Node {
    int value;
    Node leftchild;
    Node rightchild;

    // 생성자
    public Node(int value) {
        this.value = value;
        leftchild = null; // 객체이므로 null로 초기화
        rightchild = null;
    }
}
