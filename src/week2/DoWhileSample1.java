package week2;

public class DoWhileSample1 {
    public static void main(String[] args) {
        // a부터 z까지 6개씩 끊어서 출력
        char c = 'a';
        int count = 0;
        do {
            System.out.print(c + " ");
            c++;
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        } while (c <= 'z');
    }
}
