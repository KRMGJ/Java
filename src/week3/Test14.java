package week3;

public class Test14 {
    public static void main(String[] args) {
        // 1부터 10까지 합계를 구하는데 합이 20을 넘으면 그때의 i값과 합계 출력
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            if (sum > 20) {
                System.out.println("i: " + i + ", 합계: " + sum);
                break;
            }
        }
    }
}
