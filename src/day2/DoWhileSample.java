package day2;

public class DoWhileSample {
    public static void main(String[] args) {
        // a부터 z까지 출력
        // 5개씩 끊어서 줄바꾸기
        char c = 'a';
        do {
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z');
    }
}
