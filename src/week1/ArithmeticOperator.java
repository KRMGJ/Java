package week1;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 입력받은 초를 시간, 분, 초로 환산하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.println(time + "초는 ");
        System.out.println(hour + "시간, ");
        System.out.println(minute + "분, ");
        System.out.println(second + "초입니다.");

        scanner.close();
    }
}
