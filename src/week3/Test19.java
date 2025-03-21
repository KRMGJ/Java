package week3;

public class Test19 {
    public static void main(String[] args) {
        // 2차원 배열에서 열을 고정시키고 행에 값을 넣고 출력
        int[][] twoArray = new int[3][5];
        int num = 1;
        for (int j = 0; j < twoArray[0].length; j++) {
            for (int i = 0; i < twoArray.length; i++) {
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
