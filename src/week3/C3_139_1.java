package week3;

public class C3_139_1 {
    public static void main(String[] args) {
        // 10개의 정수를 저장하는 배열 tenArray 를 선언하고 생성하는 코드
        int[] tenArray = new int[10];

        // 배열의 크기를 출력
        System.out.println("배열의 크기: " + tenArray.length);

        // 배열에 1부터 10까지 저장한 뒤 모든 원소의 값을 더하여 출력
        int sum = 0;
        for (int i = 0; i < tenArray.length; i++) {
            tenArray[i] = i + 1;
            sum += tenArray[i];
        }
        System.out.println("배열의 모든 원소의 합: " + sum);

        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        for (int i = 0; i < tenArray.length; i++) {
            System.out.print(tenArray[i]);
            if (i != tenArray.length - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
}
