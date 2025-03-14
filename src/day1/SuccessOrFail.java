package day1;

import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        // 입력받은 점수가 80점 이상이면 합격, 아니면 불합격을 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하시요: ");
        int score = scanner.nextInt();
        if (score >= 80) {
            System.out.println("축하합니다! 합격입니다.");
        }
        scanner.close();
    }
}
