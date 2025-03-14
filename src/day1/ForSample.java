package day1;

public class ForSample {
    public static void main(String[] args) {
        // 1~10까지의 합 구하기
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            sum += i;
            if (i <= 9) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
                System.out.println(sum);
            }
        }
    }
}
