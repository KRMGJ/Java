package week3;

public class Test17 {
    public static void main(String[] args) {
        // 1차원 배열 array 선언 후
        // num 정수형 선언하면서 1로 초기화
        // for 문으로 배열에 값을 저장
        // for 문으로 배열에 든 값 출력
        int[] array = new int[5];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
