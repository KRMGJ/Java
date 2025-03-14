package day1;

import java.util.Scanner;

public class Cal4 {
    public static void main(String[] args) {
        // scanner 2회반복으로 2개의 값을 받고 합을 출력 while 변경
        Scanner scanner = new java.util.Scanner(System.in);

        int sum = 0;
        int i = 0;

        System.out.println("두 수를 입력하세요.");
        while (i < 2) {
            int number = scanner.nextInt();
            sum += number;
            i++;
        }
        System.out.println("두 수의 합은 " + sum + "입니다.");
        scanner.close();
    }
}
