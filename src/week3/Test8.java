package week3;

public class Test8 {
    public static void main(String[] args) {
        // 1부터 10까지 출력 후 합계 출력
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\n합계: " + sum);
    }
}
