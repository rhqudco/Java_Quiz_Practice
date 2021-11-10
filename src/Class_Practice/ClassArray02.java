package Class_Practice;

import java.util.Random;
import java.util.Scanner;

class Students {
    private int hakbun;
    private int score;

    void setData(int hakbun, int score)  {
        this.hakbun = hakbun;
        this.score = score;
    }
    void printData() {
        System.out.println("학번 : " + this.hakbun + " 점수 : " + this.score);
    }
}
public class ClassArray02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Students[] sArray = new Students[5];
        for(int i = 0; i < 5; i++) {
            sArray[i] = new Students();
        }
        for(int i = 0; i < sArray.length; i++) {
            sArray[i].setData(1001+i, rand.nextInt(100)+1);
        }
        for(int i = 0; i < sArray.length; i++) {
            sArray[i].printData();
        }
    }
}
