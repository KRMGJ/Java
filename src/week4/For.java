package week4;

public class For {
    public static void main(String[] args) {
        // 구구단
        int i;
        for (i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
        System.out.println(i); // 10
    }
}
