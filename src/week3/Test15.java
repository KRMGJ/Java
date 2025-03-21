package week3;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        // 양수 5개를 입력 받아 배열에 저장하고, 제일 작은 수를 출력
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[5];

        int min = Integer.MAX_VALUE;
        System.out.println("양수 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt();
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("제일 작은 수는 " + min + "입니다.");
        scanner.close();
    }
}
