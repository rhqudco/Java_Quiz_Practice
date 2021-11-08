public class EX23 {
    public static void main(String[] args) {
        /*
         * # 2차원 반복문
         *
         * 1   2  3  4  5
         * 10  9  8  7  6
         * 11 12 13 14 15
         * 20 19 18 17 16
         * 21 22 23 24 25
         *
         *
         * 1) 오른쪽방향으로 순서대로 출력
         * 2) 왼쪽방향대로 순서대로 출력
         *
         * 1)2) 5번 반복
         *
         */
        // 문제 1번
        System.out.println("문제 1번");
        for(int i = 1; i < 26; i++) {
            System.out.print(i + "\t");
            if(i % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println();
        System.out.println("문제 2번");
    }
}
