package week1;

public class Hello {
    public static int sum(int i ,int j) {
        return i + j;
    }
    public static void main(String[] args) {
        int i;
        int j;
        char a;
        String b;
        final int TEN = 10;
        i = 1;
        j = sum(i, TEN);
        a = '?';
        b = "Hello";
        System.out.println(a);
        System.out.println(b);
        System.out.println(TEN);
        System.out.println(j);
    }
}
