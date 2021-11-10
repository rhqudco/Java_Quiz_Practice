package Class_Practice;

import java.util.Arrays;
import java.util.Random;

//has-a
// 과목별 점수
class Subject {
    String name;
    int score;


}

class Rstudents {
    String name;
    Subject[] subjectArr;

    //생성자 오버로딩
    Rstudents() {}

    Rstudents(String name) {
        this.name = name;
        this.subjectArr = new Subject[3];
    }
}
public class ClassArray03 {
    public static void main(String[] args) {
       Rstudents[] rstudents = new Rstudents[3];


       rstudents[0] = new Rstudents("고병채");
       rstudents[1] = new Rstudents("청경채");
       rstudents[2] = new Rstudents("결정체");
        System.out.println(Arrays.toString(rstudents));
        for(Rstudents stu : rstudents) {
            System.out.println("학생 : " + stu.name);
        }
        Rstudents go = null;
        for(Rstudents stu: rstudents)   {
            if(stu.name.equals("고병채")) {
                go = stu;
                break;
            }
        }

        for(int i = 0; i < go.subjectArr.length; i++) {
            go.subjectArr[i] = new Subject();
        }
        System.out.printf("과목별 점수 객체: %s\n", Arrays.toString(go.subjectArr));
        go.subjectArr[0].name = "국어";
        go.subjectArr[0].score = 60;
        go.subjectArr[1].name = "수학";
        go.subjectArr[1].score = 80;
        go.subjectArr[2].name = "영어";
        go.subjectArr[2].score = 100;
        for(Subject sub : go.subjectArr) {
            System.out.printf("과목: %s, 점수: %d\n", sub.name, sub.score);
        }
    }
}
