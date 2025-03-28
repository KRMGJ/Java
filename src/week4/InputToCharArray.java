package week4;

import java.util.Scanner;

public class InputToCharArray {
    public static void main(String[] args) {
        // 한 줄을 입력받아 배열변수에 저장하고 그 내용 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
        scanner.close();
    }
}
