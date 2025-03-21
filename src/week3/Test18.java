package week3;

public class Test18 {
    public static void main(String[] args) {
        // 2차원 배열 twoArray 선언 후 2차원 배열에 값을 저장하고 출력
        int[][] twoArray = new int[3][5];
        int num = 1;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
