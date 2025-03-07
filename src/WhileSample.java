import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        // while 이용하여 정수를 여러 개 입력 받고 평균을 출력하라. -1이 입력되면 입력을 종료한다
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        int number = scanner.nextInt();
        while (number != -1) {
            sum += number;
            count++;
            number = scanner.nextInt();
        }
        if (count == 0) {
            System.out.println("입력된 수가 없습니다.");
        } else {
            System.out.println("평균은 " + (double) sum / count + "입니다.");
        }
        scanner.close();
    }
}
