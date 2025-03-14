package day1;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        // 점수를 입력받아 학점을 출력하는 프로그램
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다.");
        scanner.close();
    }
}
