package week4;

public class ForEach {
    public static void main(String[] args) {
        // 정수형 배열을 만들고 출력
        int[] arr = new int[10];
        int j = 1;
        for (int no : arr) {
            arr[j - 1] = j;
            no = j++;
        }

        for(int e : arr) {
            System.out.print(e + " ");
        }
    }
}
