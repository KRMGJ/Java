package day1;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "는 짝수입니다.");
        } else {
            System.out.println(number + "는 홀수입니다.");
        }
        scanner.close();
    }
}
