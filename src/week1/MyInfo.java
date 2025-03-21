package week1;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        // 이름, 주소, 전화번호, 나이를 입력받아 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("주소를 입력하세요: ");
        String address = scanner.nextLine();

        System.out.println("전화번호를 입력하세요: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("\n입력한 정보는 다음과 같습니다.");
        System.out.println("이름: " + name);
        System.out.println("주소: " + address);
        System.out.println("전화번호: " + phoneNumber);
        System.out.println("나이: " + age);

        scanner.close();
    }
}
