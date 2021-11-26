package AlgoPractice;

public class Recur {
    public static void main(String[] args) {
        System.out.println(recur(10));
    }
    static int recur(int a) {
        if(a == 0) return 0;
        else return a + recur(a - 1);
    }
}
