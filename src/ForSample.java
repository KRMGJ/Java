public class ForSample {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            sum += i;
            if (i <= 9) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
                System.out.println(sum);
            }
        }
    }
}
