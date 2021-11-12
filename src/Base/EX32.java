package Base;

import java.util.Scanner;

public class EX32 {
    public static void main(String[] args) {
        /*
         * # 숫자이동[1단계]
         *
         * 1. 숫자2는 캐릭터이다.
         * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
         *    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
         * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
         *
         */
        Scanner scan = new Scanner(System.in);
        int[] game = {0, 0, 2, 0, 0, 0, 0};
        int player = 0;

        for (int i=0; i<7; i++) {
            if (game[i] == 2) {
                player = i;
            }
        }

        while(true) {
            for(int i = 0; i < game.length; i++) {
                if (game[i] == 2) {
                    System.out.print("옷");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
            System.out.print("왼쪽[1] 오른쪽[2] : ");
            int move = scan.nextInt();
            if(move == 1) { //왼쪽
                for(int i = 0; i < game.length; i++) {
                    if(game[i] == 2) {
                        if(i == 0) {
                            continue;
                        }
                        int tmp = game[i-1];
                        game[i-1] = game[i];
                        game[i] = tmp;
                    }
                }
            }
            else if (move == 2) {
                for(int i = 0; i < game.length; i++) {
                    if(game[i] == 2) {
                        if(i == game.length -1) {
                            continue;
                        }
                        game[i+1] = game[i];
                        game[i] = 0;
                        break;
                    }
                }
            }
        }
    }
}