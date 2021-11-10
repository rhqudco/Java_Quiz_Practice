package Class_Practice;

import java.util.Scanner;

class mSubject {
    String name;
    int score;
    int stdCnt;
}

class mStudent {
    // 클래스 변수(Static/정적 변수)
    // 공유변수(모든 객체가 하나의 클래스 변수를 공유함)
    static int stdCnt = 0;
    String name;
    mSubject[] subjectArray;
}
public class ClassArray04 {
    public static void main(String[] args) {
// # 학생 추가 삭제 컨트롤러
        //   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
        //   김철수 : 과목3개 수학 50 국어50 영어 60
        //   이만수 : 과목2개 수학 20 국어 30
        //   이영희 : 과목1개 수학 100
        Scanner scan = new Scanner(System.in);
        mStudent[] stdList = new mStudent[3];


        while (true) {
            // 클래스 변수는 클래스를 통해서 접근 가능
            System.out.println(mStudent.stdCnt);

            for(int i = 0; i < mStudent.stdCnt; i++ ) {
                System.out.printf("[%d] %s 학생\n", i+1, stdList[i].name );

                if( stdList[i].subjectArray != null ) {
                    for( int j = 0; j < stdList[i].subjectArray.length; j ++ ) {
                        System.out.printf("[%d] %s 과목 = %d점\n",
                                j+1,
                                stdList[i].subjectArray[j].name, // i번째 학생의 j번째 과목 이름
                                stdList[i].subjectArray[j].score); // i번째 학생의 j번째 과목 점수
                    }
                }
                System.out.println();
            }

            System.out.println("[1]학생 추가하기");        // 이름 입력받아 추가
            System.out.println("[2]과목 추가하기");        // 이름과 과목 입력받아 추가
            System.out.println("[3]성적 추가하기");        // 이름과 과목 그리고 성적 입력받아 추가
            System.out.println("[4]종료하기");

            System.out.print("선택");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("이름 입력: ");
                String name = scan.next();

                stdList[mStudent.stdCnt] = new mStudent();
                stdList[mStudent.stdCnt].name = name;
                mStudent.stdCnt++;
            } else if (choice == 2) {
                int number = 0;
                for ( mStudent stu: stdList ) {
                    if ( stu != null ) System.out.printf("[%d] %s\n", ++number, stu.name);
                }
                System.out.print("학생 선택: ");
                int select = scan.nextInt();
                select--;

                System.out.print("과목 입력: ");
                String subject = scan.next();
                if ( stdList[select].subjectArray == null ) {
                    // 과목 객체를 저장하기 위한 배열을 먼저 생성
                    stdList[select].subjectArray = new mSubject[1];

                    // 과목 객체를 생성해서 배열에 저장
                    stdList[select].subjectArray[0] = new mSubject();
                    stdList[select].subjectArray[0].name = subject;
                } else {
                    // 과목에 대한 정보를 저장하는 배열이 이미 있다면 뒤에 추가
                    // 배열의 크기를 확인
                    int size = stdList[select].subjectArray.length;

                    // 기존의 배열을 imsi 메모리로 바꿔줍니다.
                    mSubject [] imsi = stdList[select].subjectArray;

                    // 과목을 저장할 배열의 크기를 늘려주기 위해서
                    // 배열을 새로 생성
                    stdList[select].subjectArray = new mSubject[size + 1];

                    //기존의 과목 정보를 새로운 배열로 복사
                    for(int i = 0; i < size; i++) {
                        stdList[select].subjectArray[i] = imsi[i];
                    }

                    // 그리고 새로 입력받은 과목 정보를 맨 마지막에 추가
                    stdList[select].subjectArray[size] = new mSubject();
                    stdList[select].subjectArray[size].name = subject;
                }
            } else if (choice == 3) {

            }

        }

    }
}


