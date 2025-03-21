package week3;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        // 5개 정수형 배열 값 입력 후 평균 구하기
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.println("평균은 " + (double) sum / intArray.length + "입니다.");
        scanner.close();
    }
}
