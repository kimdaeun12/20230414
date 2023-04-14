package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private Scanner sc; //스캐너 클래스로 변수 sc를 선언한다. 그리고 변수는 앱클래스 객체 내에서만 접근 가능

    public App(Scanner sc) { // App클래스로 객체생성시에 Scanner형 변수 sc를 받는 생성자 함수

        this.sc = sc; //이 클래스에 있는 변수 sc에 매개변수로 받은 변수 sc를 저장한다.
    }

    // 실제 애플리케이션이 구동될 메서드
    public void run() {
        ArrayList<WiseSaying> sayingList = new ArrayList<>();
        //초기화면
        System.out.println("== 명언 앱 ==");

        List<WiseSaying> wiseSayings = new ArrayList<>();

        int id = 1; //명언 수량 카운트 변수 초기화
        while (true) {//입력을 반복적으로 받아서 입력 결과에 따라 처리 과정을 수행하기 위해서 반복문 사용한다.
            System.out.printf("명령) "); // 명령 입력을 유도하는 구문 출력
            String command = sc.nextLine().trim();
            //이 스캐너에 입력받는라인의 문자를 양쪽공백제거해서 command에 담는다.

            //입력받은 command에 따라서 실행할 구문들
            if (command.equals("종료")) { //입력된 command가 종료 라면
                System.out.println("프로그램을 종료합니다."); //앱이 종료된다는 구문 출력
                return; //현재 실행중인 run매서드 종료
            } else if (command.equals("등록")) { //입력된 command가 등록 이면
                System.out.printf("명언 : "); //명언 입력을 유도하는 구문 출력
                String saying = sc.nextLine().trim();
                //이 스케너에 입력받는 라인의 문자를 양쪽공백제거해서 saying에 저장한다.
                System.out.printf("작가 : "); // 작가 입력을 유도하는 구문 출력
                String author = sc.nextLine().trim();

                //명언 저장 코드
                sayingList.add(new WiseSaying(id, author, saying));

                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);


                //이 스캐너에 입력받는 라인의 문자를 양쪽공백제거해서 author에 저장한다.
                System.out.println(id + "번 명언이 등록되었습니다.");
                //몇번 명언이 등록됐는지 알려주는 구문 출력
                id++; // 다음 등록을 위해서 명언 수량 이 1씩 증가한다

            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(27));
                System.out.println(sayingList.get(0));
            }
        }
//== 명언 앱 ==
// 명령) 종료
    }
}
