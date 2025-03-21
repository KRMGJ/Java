package week2;

public class DoWhileSample2 {
    public static void main(String[] args) {
        // a부터 z까지 6개씩 끊어서 for문으로 출력
        char c = 'a';
        int count = 0;
        for(; c <= 'z'; c++) {
            System.out.print(c + " ");
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        }
    }
}
