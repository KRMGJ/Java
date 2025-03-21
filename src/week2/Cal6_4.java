package week2;

public class Cal6_4 {
    public static void main(String[] args) {
        // 2~9단 출력
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("=== " + dan + "단 " + "===");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + dan * i);
            }
            System.out.println();
        }
    }
}
