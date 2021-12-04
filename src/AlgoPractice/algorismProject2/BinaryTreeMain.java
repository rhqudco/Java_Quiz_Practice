package AlgoPractice.algorismProject2;

import java.util.Scanner;
import static java.lang.System.exit;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        while (true) {
            System.out.println("(1) 상품 등록  (2) 상품 삭제  (3) 상품 검색  (4) 전체 상품 조회  (5) 종료");
            System.out.print("메뉴 선택 : ");
            int menu = scan.nextInt();

            System.out.println();
            if (menu == 1) {
                System.out.print("상품 등록");
                System.out.print("상품 번호 입력 : ");
                int insertProduct = scan.nextInt();

                System.out.print("상품명 입력 : ");
                String insertProductName = scan.next();

                tree.insertNode(insertProduct, insertProductName);
                System.out.println();

            } else if (menu == 2) {
                System.out.println("상품 삭제");
                System.out.print("상품 번호 입력 : ");
                int removeProduct = scan.nextInt();

                tree.removeNode(removeProduct);

                System.out.println("상품 삭제 완료");
                System.out.println();

            } else if (menu == 3) {
                System.out.println("상품 검색");
                System.out.print("상품 번호 입력 : ");
                int searchProudct = scan.nextInt();
                tree.searchBTree(tree.rootNode, searchProudct);
                System.out.println();

            } else if (menu == 4) {
                //tree.printSubTree(tree.rootNode);
                tree.preorderTree(tree.rootNode, 0);
                System.out.println();

            } else if (menu == 5) {
                System.out.println("종료합니다.");
                exit(0);

            } else {
                System.out.println("잘못된 입력입니다.");
                System.out.println("프로그램을 종료 합니다.");
                exit(0);
            }
        }
    }
}
