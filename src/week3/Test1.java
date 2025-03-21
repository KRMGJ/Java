package week3;

public class Test1 {
    public static void main(String[] args) {
        // 1부터 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1부터 10까지 짝수만 출력
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1부터 10까지 홀수만 출력
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // * 5개 출력
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();

        // * 10개 출력
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println("\n");

        // * 10개를 2줄 출력
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // * 10개를 3줄 출력
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // * 10개를 5번 출력
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
