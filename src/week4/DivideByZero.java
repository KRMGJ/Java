package week4;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        // 0으로 나누기 연산을 수행
        Scanner scanner = new Scanner(System.in);
        int dividend; // 나뉨수
        int divisor; // 나눗수

        System.out.print("나뉨수를 입력하시오: ");
        dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오: ");
        divisor = scanner.nextInt();
        System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
        scanner.close();
    }
}
