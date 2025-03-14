package day2;

import java.util.Scanner;

public class Cal6_2 {
    public static void main(String[] args) {
        // 단을 입력받아 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("단을 입력하세요 : ");
        int dan = scanner.nextInt();
        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        scanner.close();
    }
}
