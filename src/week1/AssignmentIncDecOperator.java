package week1;

public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        // 대입 연산자와 증감 연산자
        int a = 3, b = 3, c = 3;

        a += 3;
        b *= 3;
        c %= 2;
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);

        int d = 3;
        a = d++;
        System.out.println("a=" + a + ", d=" + d);
        a = ++d;
        System.out.println("a=" + a + ", d=" + d);
        a = d--;
        System.out.println("a=" + a + ", d=" + d);
        a = --d;
        System.out.println("a=" + a + ", d=" + d);
    }
}
