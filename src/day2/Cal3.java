package day2;

import java.util.Scanner;

public class Cal3 {
    public static void main(String[] args) {
        // 입력된 수의 평균을 계산하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

        int sum = 0;
        int count = 0;

        int number = scanner.nextInt();
        while (number != -1) {
            sum += number;
            count++;
            number = scanner.nextInt();
        }
        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.println("평균은 " + (double) sum / count + "입니다.");
        }
        scanner.close();
    }
}
