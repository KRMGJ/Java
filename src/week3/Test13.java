package week3;

public class Test13 {
    public static void main(String[] args) {
        // 1부터 10까지 출력 중 5를 만나면 5를 출력하지 않고 탈출
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
