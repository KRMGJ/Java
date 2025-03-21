package week2;

import java.util.Scanner;

public class Cal6_1 {
    public static void main(String[] args) {
        // 2단 출력
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        scanner.close();
    }
}
