package week2;

public class Cal6_7 {
    public static void main(String[] args) {
        // 2단부터 9단까지 가로로 출력
        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(dan + " * " + i + " = " + dan * i + "\t");
            }
            System.out.println();
        }
    }
}
