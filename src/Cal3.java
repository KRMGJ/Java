import java.util.Scanner;

public class Cal3 {
    public static void main(String[] args) {
        // scanner 2회반복으로 2개의 값을 받고 합을 출력
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("두 수를 입력하세요.");
        for (int i = 0; i < 2; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("두 수의 합은 " + sum + "입니다.");
        scanner.close();
    }
}
