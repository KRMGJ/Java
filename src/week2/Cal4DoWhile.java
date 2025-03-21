package week2;

import java.util.Scanner;

public class Cal4DoWhile {
    public static void main(String[] args) {
        // do-while문을 사용하여 입력받은 수의 합계와 평균을 구하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수의 개수 : ");
        int sum = 0;
        int count = scanner.nextInt();
        int i = 0;

        System.out.println("값을 입력하세요.");
        do {
            System.out.print(i + " : ");
            int number = scanner.nextInt();
            sum += number;
            i++;
        } while (i < count);

        System.out.println("합계 : " + sum + " 평균 : " + (double) sum / count);
        scanner.close();
    }
}
