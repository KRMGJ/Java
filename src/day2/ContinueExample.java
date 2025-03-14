package day2;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        // 정수를 5개 입력 받고 양수들만 합하여 출력
        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("정수를 입력하세요 : ");
//            int n = scanner.nextInt();
//            if (n <= 0) {
//                continue;
//            }
//            sum += n;
//        }
//        System.out.println("양수의 합은 : " + sum);
//        scanner.close();

        // continue를 사용하지 않고 작성
        int sum = 0;
        int count = 0;
        while (count < 5) {
            System.out.print("정수를 입력하세요 : ");
            int n = scanner.nextInt();
            count++;
            if (n > 0) {
                sum += n;
            }
        }
        System.out.println("양수의 합은 : " + sum);
        scanner.close();
    }
}
