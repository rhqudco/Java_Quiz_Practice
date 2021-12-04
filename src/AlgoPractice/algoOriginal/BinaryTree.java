package AlgoPractice.algoOriginal;

import static java.lang.System.exit;

public class BinaryTree {
    Node rootNode = null;

    public void insertNode(int element, String name) {
        if(rootNode == null) { // 루트가 빈 경우 즉, 아무 노드도 없으면 노드 생성
            rootNode = new Node(element, name);
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
                        currentNode.leftchild = new Node(element, name);
                        break;
                    }
                }
                else { // 현재 루트보다 큰 경우 오른쪽으로 탐색
                    head = head.rightchild;
                    // 왼쪽 자식 노드가 비어 있는 경우, 해당 위치에 추가할 노드 삽입
                    // 현재 currentNode는 head를 가리키고 있음
                    if(head == null) {
                        currentNode.rightchild = new Node(element, name);
                        break;
                    }
                }
            }
        }
    }

    public boolean removeNode(int element) {
        Node removeNode = rootNode;
        Node parentOfRemoveNode = null;

        while (removeNode.value != element) {
            parentOfRemoveNode = removeNode;

            /* 삭제할 값이 현재 노드보다 작으면 왼쪽을 탐색한다. */
            if (removeNode.value > element) {
                removeNode = removeNode.leftchild;
            } else {
                removeNode = removeNode.rightchild;
            }

            /*
             * 값 대소를 비교하며 탐색했을 때
             * 잎 노드(Leaf node)인 경우 삭제를 위한 탐색 실패
             */
            if (removeNode == null)
                return false;

        }

        /* 자식 노드가 모두 없을 때 */
        if (removeNode.leftchild == null && removeNode.rightchild == null) {
            /* 삭제 대상이 트리의 루트일 때 */
            if (removeNode == rootNode) {
                rootNode = null;
            } else if (removeNode == parentOfRemoveNode.rightchild) {
                parentOfRemoveNode.rightchild = null;
            } else {
                parentOfRemoveNode.leftchild = null;
            }
        }

        /* 오른쪽 자식 노드만 존재하는 경우 */
        else if (removeNode.leftchild == null) {
            if (removeNode == rootNode) {
                rootNode = removeNode.rightchild;
            } else if (removeNode == parentOfRemoveNode.rightchild) {
                /*
                 * 삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둔다.
                 */
                parentOfRemoveNode.rightchild = removeNode.rightchild;
            } else {
                parentOfRemoveNode.leftchild = removeNode.rightchild;
            }
        }

        /* 왼쪽 자식 노드만 존재하는 경우 */
        else if (removeNode.rightchild == null) {
            if (removeNode == rootNode) {
                rootNode = removeNode.leftchild;
            } else if (removeNode == parentOfRemoveNode.rightchild) {
                parentOfRemoveNode.rightchild = removeNode.leftchild;
            } else {
                /*
                 * 삭제 대상의 왼쪽 자식을 삭제 대상 위치에 둔다.
                 */
                parentOfRemoveNode.leftchild = removeNode.leftchild;
            }
        }

        /*
         * 두 개의 자식 노드가 존재하는 경우
         * 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나
         * 오른쪽 서브 트리에 있는 가장 작은 값 노드를 올리면 된다.
         * 구현 코드는 2번째 방법을 사용한다.
         */
        else {
            /* 삭제 대상 노드의 자식 노드 중에서 대체될 노드(replaceNode)를 찾는다. */
            Node parentOfReplaceNode = removeNode;

            /* 삭제 대상의 오른쪽 서브 트리 탐색 지정 */
            Node replaceNode = parentOfReplaceNode.rightchild;

            while (replaceNode.leftchild != null) {
                /* 가장 작은 값을 찾기 위해 왼쪽 자식 노드로 탐색한다. */
                parentOfReplaceNode = replaceNode;
                replaceNode = replaceNode.leftchild;
            }

            if (replaceNode != removeNode.rightchild) {
                /* 가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈 노드가 된다. */
                parentOfReplaceNode.leftchild = replaceNode.rightchild;

                /* 대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정한다. */
                replaceNode.rightchild = removeNode.rightchild;
            }

            /* 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꾼다. */
            if (removeNode == rootNode) {
                rootNode = replaceNode;
            } else if (removeNode == parentOfRemoveNode.rightchild) {
                parentOfRemoveNode.rightchild = replaceNode;
            } else {
                parentOfRemoveNode.leftchild = replaceNode;
            }

            /* 삭제 대상 노드의 왼쪽 자식을 잇는다. */
            replaceNode.leftchild = removeNode.leftchild;
        }
        return true;
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
        else {
            System.out.println("등록된 상품이 없습니다.");
            exit(0);
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
