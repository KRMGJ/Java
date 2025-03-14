package day2;

public class Cal1 {
    public static void main(String[] args) {
        // 1부터 10까지의 합 출력
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            if (i < 10) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = ");
            }
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
