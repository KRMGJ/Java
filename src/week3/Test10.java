package week3;

public class Test10 {
    public static void main(String[] args) {
        // 10부터 1까지 짝수 출력 후 합계 출력
        int sum = 0;
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n합계: " + sum);
    }
}
