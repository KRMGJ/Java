package week3;

public class Test7 {
    public static void main(String[] args) {
        // * 5개 3줄 출력을 2번 반복
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 5; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
