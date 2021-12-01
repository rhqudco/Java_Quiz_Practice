package AlgoPractice.tree;

public class BinaryTree {
    Node rootNode = null;

    public void insertNode(int element) {
        if(rootNode == null) { // 루트가 빈 경우 즉, 아무 노드도 없으면 노드 생성
            rootNode = new Node(element);
        }
        else {
            Node head = rootNode;
            Node currentNode;
            while (true) {
                currentNode = head;
                // 현재 루트보다 작은 경우 왼쪽으로 탐색
                if(head.value > element) {
                    head = head.leftchild;
                    // 왼쪽 자식 노드가 비어 있는 경우, 해당 위치에 추가할 노드 삽입
                    // 현재 currentNode는 head를 가리키고 있음
                    if(head == null) {
                        currentNode.leftchild = new Node(element);
                        break;
                    }
                }
                else { // 현재 루트보다 큰 경우 오른쪽으로 탐색
                    head = head.rightchild;
                    // 왼쪽 자식 노드가 비어 있는 경우, 해당 위치에 추가할 노드 삽입
                    // 현재 currentNode는 head를 가리키고 있음
                    if(head == null) {
                        currentNode.rightchild = new Node(element);
                        break;
                    }
                }
            }
        }
    }
    // 전위 순회 root - left - right
    public void preorderTree(Node root, int depth) {
        if(root != null) {
            for(int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value); // root
            preorderTree(root.leftchild, depth+1); // left
            preorderTree(root.rightchild, depth+1); // right
        }
    }
    // 중위 순회 left - root - right
    public void inorderTree(Node root, int depth) {
        if(root != null) {
            inorderTree(root.leftchild, depth+1); // left
            for(int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value); // root
            inorderTree(root.rightchild, depth+1); // right
        }
    }
    // 중위 순회 left - right - root
    public void postorderTree(Node root, int depth) {
        if(root != null) {
            postorderTree(root.leftchild, depth+1); // left
            postorderTree(root.rightchild, depth+1); // right
            for(int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.value); // root
        }
    }
    public void searchBTree(Node n, int target) {
        try {
            if(target < n.value) {
                System.out.println("타겟이 " + n.value + "보다 작음");
                searchBTree(n.leftchild, target);
            }
            else if(target > n.value) {
                System.out.println("타겟이 " + n.value + "보다 큼");
                searchBTree(n.rightchild, target);
            }
            else {
                System.out.println("타겟이 " + n.value + "임");
            }
        } catch (Exception e) {
            System.out.println("찾지 못함.");
        }
    }
}
