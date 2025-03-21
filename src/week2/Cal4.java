package week2;

import java.util.Scanner;

public class Cal4 {
    public static void main(String[] args) {
        // 입력받은 정수의 개수만큼 정수를 입력받아 합계와 평균을 출력
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수의 개수 : ");
        int sum = 0;
        int count = scanner.nextInt();

        System.out.println("값을 입력하세요.");
        for(int i = 0; i < count; i++) {
            System.out.print(i + " : ");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("합계 : " + sum + " 평균 : " + (double) sum / count);
        scanner.close();
    }
}
