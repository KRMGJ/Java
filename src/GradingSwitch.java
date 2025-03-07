import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        grade = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
        System.out.println("학점은 " + grade + "입니다.");
        scanner.close();
    }
}
