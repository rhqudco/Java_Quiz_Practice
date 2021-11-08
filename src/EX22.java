public class EX22 {
    public static void main(String[] args) {
        /*
         * 예)
         * ###
         * ###
         * ###
         */
        System.out.println("문제 예");
        for(int i  = 0; i < 3; i++) {
            for(int j  = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        /*
         * 문제 1)
         * #
         * ##
         * ###
         */
        System.out.println();
        System.out.println("문제 1");
        for(int i  = 0; i < 3; i++) {
            for(int j  = 0; j < i+1; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }

        /*
         * 문제 2)
         *   #
         *  ##
         * ###
         */
        System.out.println();
        System.out.println("문제 2");
        for(int i = 0; i < 3; i++) {
            for(int j = 2; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

        /*
         * 문제 3)
         * ###
         * ##
         * #
         */
        System.out.println();
        System.out.println("문제 3");
        for(int i = 0; i < 3; i++) {
            for(int j = 3; j > i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }

        /*
         * 문제 4)
         * ###
         *  ##
         *   #
         */
        System.out.println();
        System.out.println("문제 4");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 3; k > i; k--) {
                System.out.print("#");
            }
            System.out.println();
        }

        /*
         * 문제 5)
         * @##
         * @@#
         * @@@
         */

        /*
         * 문제 6)
         *   #
         *  ###
         * #####
         */

        /*
         * 문제 7)
         *  #####
         *   ###
         *    #
         */
    }
}
