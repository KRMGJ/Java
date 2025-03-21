package week3;

public class C3_129_1 {
    public static void main(String[] args) {
        // 2중 for 문을 사용하여 * 이 5 4 3 2 1개씩 출력
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2중 for 문을 사용하여 * 이 1 2 3 4 5개씩 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
