package week1;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        // 입력받은 점수와 학년에 따라 합격, 불합격 판별
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        System.out.print("학년을 입력하세요: ");
        int year = scanner.nextInt();

        if(score >= 60 && year != 4 || score >= 70) {
            System.out.println("합격!");
        } else {
            System.out.println("불합격!");
        }
        scanner.close();
    }
}
