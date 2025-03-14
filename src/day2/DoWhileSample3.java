package day2;

public class DoWhileSample3 {
    public static void main(String[] args) {
        // z부터 a까지 출력
        char c = 'z';
        do {
            System.out.print(c);
            c--;
        } while (c >= 'a');
    }
}
