package week4;

public class Test1 {
    public static void main(String[] args) {
        // 2차원 배열 생성 후 출력
        int[][] arr = new int[2][5];
        int k = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
