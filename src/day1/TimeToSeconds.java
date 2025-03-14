package day1;

import java.util.Scanner;

public class TimeToSeconds {
    public static void main(String[] args) {
        // 입력받은 시간, 분, 초를 초로 환산하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.print("시간을 입력하세요: ");
        int hour = scanner.nextInt();

        System.out.print("분을 입력하세요: ");
        int minute = scanner.nextInt();

        System.out.print("초를 입력하세요: ");
        int second = scanner.nextInt();

        int totalSeconds = (hour * 3600) + (minute * 60) + second;

        System.out.println(hour + "시간 " + minute + "분 " + second + "초는 총 " + totalSeconds + "초입니다.");

        scanner.close();
    }
}
