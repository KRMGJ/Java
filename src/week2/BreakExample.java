package week2;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        // exit을 입력할 때까지 무한 반복
        Scanner scanner = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료합니다.");
        while (true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
