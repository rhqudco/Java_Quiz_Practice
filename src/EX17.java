public class EX17 {
    public static void main(String[] args) {
        /*
         * # 369게임[2단계]
         *
         * 1. 1~50까지 반복을 한다.
         * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
         * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
         *
         */
        for(int i = 1; i <= 50; i++) {
            if(String.valueOf(i).contains("3")) {
                System.out.println("짝" + " ");
            }
            else if(String.valueOf(i).contains("6")) {
                System.out.println("짝" + " ");
            }
            else
                if(String.valueOf(i).contains("9")) {
                System.out.println("짝" + " ");
            }
            else {
                System.out.println(i + " ");
            }
        }
    }
}
