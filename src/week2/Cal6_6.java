package week2;

import java.util.Scanner;

public class Cal6_6 {
    public static void main(String[] args) {
        // 입력한 단 가로로 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 단을 입력하세요 : ");
        int dan = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.print(dan + " * " + i + " = " + dan * i + "\t");
        }
        scanner.close();
    }
}
