package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        // 3개의 정수를 입력받아 합을 구하는 프로그램
        // Input MisMatch Exception
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 3개 입력하세요: ");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            try {
                n = scanner.nextInt();
            } catch (InputMismatchException exception) {
                String token = scanner.nextLine();
                System.out.println(token + "은 정수가 아닙니다. 다시 입력하세요!");
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum + "입니다.");
        scanner.close();
    }
}
