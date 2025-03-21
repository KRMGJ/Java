package week3;

public class C3_129_2 {
    public static void main(String[] args) {
        // 1부터 100까지 3의 배수의 합을 구하는 프로그램
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("1부터 100까지 3의 배수의 합: " + sum);
    }
}
