package week3;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        // 사용자로부터 단을 입력받아 구구단 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("단을 입력하세요 : ");
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
        scanner.close();
    }
}
