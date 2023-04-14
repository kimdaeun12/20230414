package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc라는 이름을 가진 스캐너형의 변수에 스캐너를 선언?
        new App(sc).run(); //App클래스에 sc를 사용하기 위해 매개변수로 담는다. App에 있는 run객체를 사용
        sc.close(); //sc를 닫는다.
    }
}
