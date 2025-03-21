package week3;

public class Test9 {
    public static void main(String[] args) {
        // 1부터 10까지 짝수를 출력 후 합계 출력
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n합계: " + sum);
    }
}
