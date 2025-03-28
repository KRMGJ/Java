package week4;

public class DoubleTest {
    // 배열의 합을 구하는 메소드
    public static double getSum(double[] arr) {
        double sum = 0;
        for(double num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        // 배열의 합을 구하는 메소드 호출
        double[] data = {1.2, 2.5, 3.0, 4.1, 5.6};
        double result = getSum(data);
        System.out.println("배열의 합: " + result);
    }
}
