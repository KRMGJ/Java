package week2;

import java.util.Scanner;

public class CalSum {
    public static void main(String[] args) {
        // -999를 입력하면 종료
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int n = scanner.nextInt();
            if (n == -999) {
                break;
            }
            sum += n;
        }
        System.out.println("합은 : " + sum);
        scanner.close();
    }
}
